package co.com.parabank.interactions.userInterface.parabankLogin.login;

import co.com.parabank.pages.ParabankLoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnLoginButton implements Interaction {
    @Override
    @Step("{0} hace clic sobre el boton LOGIN")
    public <T extends Actor> void performAs(T actor) {
        Click.on(ParabankLoginPage.LOGIN_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(12))).performAs(actor);
    }
}

