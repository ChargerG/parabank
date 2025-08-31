package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterFirstName implements Interaction {
    private final String firstName;

    public EnterFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    @Step("{0} ingresa el primer nombre")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(firstName).into(ParabankRegisterPage.FIRST_NAME_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

