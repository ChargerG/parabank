package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterPassword implements Interaction {
    private final String password;

    public EnterPassword(String password) {
        this.password = password;
    }

    @Override
    @Step("{0} define la clave de su cuenta")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(password).into(ParabankRegisterPage.PASSWORD_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

