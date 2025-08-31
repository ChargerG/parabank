package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterState implements Interaction {
    private final String state;

    public EnterState(String state) {
        this.state = state;
    }

    @Override
    @Step("{0} ingresa el estado")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(state).into(ParabankRegisterPage.STATE_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

