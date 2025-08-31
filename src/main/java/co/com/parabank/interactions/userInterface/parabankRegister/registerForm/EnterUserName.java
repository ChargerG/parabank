package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterUserName implements Interaction {
    private final String userName;

    public EnterUserName(String userName) {
        this.userName = userName;
    }

    @Override
    @Step("{0} ingresa el usuario")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(userName).into(ParabankRegisterPage.USER_NAME_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

