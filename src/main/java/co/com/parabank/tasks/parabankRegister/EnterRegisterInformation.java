package co.com.parabank.tasks.parabankRegister;

import co.com.parabank.interactions.userInterface.parabankRegister.interactionsManager.RegisterForm;
import co.com.parabank.pages.ParabankLogoutPage;
import co.com.parabank.questions.parabankHome.ValidateRegister;
import co.com.parabank.questions.parabankRegister.ValidateRegisterButton;
import co.com.parabank.utils.KeyToRemember;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.time.Duration;
import java.util.Locale;

public class EnterRegisterInformation implements Task {
    public EnterRegisterInformation() {

    }

    public static EnterRegisterInformation inParabank() {
        return new EnterRegisterInformation();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("en"));
        final String regex = "[a-z]{6}";

        String username = faker.number().digits(10) + faker.regexify("[a-z]{4}");
        String password = faker.internet().password(4, 5);
        actor.remember(KeyToRemember.USERNAME.name(), username);
        actor.remember(KeyToRemember.PASSWORD.name(), password);

        actor.attemptsTo(
                RegisterForm.enterFirstName(faker.name().firstName() + faker.regexify(regex)),
                RegisterForm.enterLastName(faker.name().lastName() + faker.regexify(regex)),
                RegisterForm.enterAddress(faker.address().fullAddress()),
                RegisterForm.enterCity(faker.address().city()),
                RegisterForm.enterState(faker.address().state()),
                RegisterForm.enterCode(faker.address().countryCode()),
                RegisterForm.enterPhoneNumber(faker.phoneNumber().cellPhone()),
                RegisterForm.enterSocialSecurityNumber(faker.idNumber().valid()),
                RegisterForm.enterUserName(username),
                RegisterForm.enterPassword(password),
                RegisterForm.enterPasswordAgain(password),
                RegisterForm.clickOnRegisterButton()
        );

        if (!ParabankLogoutPage.LOGOUT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(4)).isVisibleFor(actor))
            ValidateIfUsername.exist().performAs(actor);

        Ensure.that("El boton de registro del formulario no desaparecio despues del registro",
                        ValidateRegisterButton.thereIsNotVisible())
                .isFalse().performAs(actor);
        Ensure.that("El mensaje de bienvenida no es el esperado",
                        ValidateRegister.successfull())
                .isEqualTo("Welcome " + actor.recall(KeyToRemember.USERNAME.name())).performAs(actor);
    }
}

