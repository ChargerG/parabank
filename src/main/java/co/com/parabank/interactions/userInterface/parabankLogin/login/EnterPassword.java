package co.com.parabank.interactions.userInterface.parabankLogin.login;

import co.com.parabank.pages.ParabankLoginPage;
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
    @Step("{0} ingresa la clave")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(password).into(ParabankLoginPage.PASSWORD_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

