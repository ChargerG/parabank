package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnRegisterButton implements Interaction {
    @Override
    @Step("{0} hace clic sobre el boton de Registrar")
    public <T extends Actor> void performAs(T actor) {
        Click.on(ParabankRegisterPage.REGISTER_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(12))).performAs(actor);
    }
}

