package co.com.parabank.interactions.userInterface.parabankLogin.login;

import co.com.parabank.pages.ParabankLoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterUserName implements Interaction {
    private final String user;

    public EnterUserName(String user) {
        this.user = user;
    }

    @Override
    @Step("{0} ingresa el usuario")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(user).into(ParabankLoginPage.USER_NAME_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

