package co.com.parabank.tasks.parabankRegister;

import co.com.parabank.interactions.userInterface.parabankRegister.interactionsManager.RegisterForm;
import co.com.parabank.pages.ParabankRegisterPage;
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
        int flag = 1;

        while (ParabankRegisterPage.USER_NAME_ERROR_LABEL.waitingForNoMoreThan(Duration.ofSeconds(4)).isVisibleFor(actor)) {
            if (flag >= 6)
                break;

            String username = faker.number().digits(7) + faker.regexify("[a-z]{6}");
            String password = faker.internet().password(4, 5);
            actor.remember(KeyToRemember.USERNAME.name(), username);
            actor.remember(KeyToRemember.PASSWORD.name(), password);
            RegisterForm.enterUserName(username).performAs(actor);
            RegisterForm.enterPassword(password).performAs(actor);
            RegisterForm.enterPasswordAgain(password).performAs(actor);
            RegisterForm.clickOnRegisterButton().performAs(actor);

            flag++;
        }
    }
}
