package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterCode implements Interaction {
    private final String code;

    public EnterCode(String code) {
        this.code = code;
    }

    @Override
    @Step("{0} ingresa el codigo")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(code).into(ParabankRegisterPage.CODE_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

