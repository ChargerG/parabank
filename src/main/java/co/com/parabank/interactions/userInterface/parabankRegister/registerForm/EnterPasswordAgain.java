package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterPasswordAgain implements Interaction {
    private final String password;

    public EnterPasswordAgain(String password) {
        this.password = password;
    }

    @Override
    @Step("{0} ingresa la clave nuevamente")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(password).into(ParabankRegisterPage.REPEATED_PASSWORD_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

