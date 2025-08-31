package co.com.parabank.interactions.userInterface.parabankLogin.login;

import co.com.parabank.pages.ParabankLoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnRegisterOption implements Interaction {
    @Override
    @Step("{0} abre la opcion de Registrarse")
    public <T extends Actor> void performAs(T actor) {
        Click.on(ParabankLoginPage.REGISTER_URL.waitingForNoMoreThan(Duration.ofSeconds(12))).performAs(actor);
    }
}

