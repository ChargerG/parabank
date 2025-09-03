package co.com.parabank.tasks.parabankRegister;

import co.com.parabank.interactions.userInterface.parabankRegister.interactionsManager.RegisterForm;
import co.com.parabank.pages.ParabankLogoutPage;
import co.com.parabank.utils.KeyToRemember;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.time.Duration;
import java.util.Locale;

public class ValidateIfUsername implements Task {
    public ValidateIfUsername() {
    }

    public static ValidateIfUsername exist() {
        return new ValidateIfUsername();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Faker faker = new Faker(new Locale("en"));
        final String regex = "[a-z]{6}";

        for (int i = 0; i < 9; i++) {
            String username = faker.number().digits(7) + faker.regexify(regex);
            String password = faker.internet().password(4, 5);
            actor.remember(KeyToRemember.USERNAME.name(), username);
            actor.remember(KeyToRemember.PASSWORD.name(), password);
            RegisterForm.enterFirstName(faker.name().firstName() + faker.regexify(regex)).performAs(actor);
            RegisterForm.enterLastName(faker.name().lastName() + faker.regexify(regex)).performAs(actor);
            RegisterForm.enterAddress(faker.address().fullAddress()).performAs(actor);
            RegisterForm.enterCity(faker.address().city()).performAs(actor);
            RegisterForm.enterState(faker.address().state()).performAs(actor);
            RegisterForm.enterCode(faker.address().countryCode()).performAs(actor);
            RegisterForm.enterPhoneNumber(faker.phoneNumber().cellPhone()).performAs(actor);
            RegisterForm.enterSocialSecurityNumber(faker.idNumber().valid()).performAs(actor);
            RegisterForm.enterUserName(username).performAs(actor);
            RegisterForm.enterPassword(password).performAs(actor);
            RegisterForm.enterPasswordAgain(password).performAs(actor);
            RegisterForm.clickOnRegisterButton().performAs(actor);
            if (ParabankLogoutPage.LOGOUT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(5)).isVisibleFor(actor))
                break;
        }
    }
}
