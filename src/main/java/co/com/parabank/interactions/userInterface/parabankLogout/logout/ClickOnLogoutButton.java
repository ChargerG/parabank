package co.com.parabank.interactions.userInterface.parabankLogout.logout;

import co.com.parabank.pages.ParabankLogoutPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class ClickOnLogoutButton implements Interaction {

    @Override
    @Step("{0} hace clic sobre el boton de LOGOUT")
    public <T extends Actor> void performAs(T actor) {
        Click.on(ParabankLogoutPage.LOGOUT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(12))).performAs(actor);
    }
}

