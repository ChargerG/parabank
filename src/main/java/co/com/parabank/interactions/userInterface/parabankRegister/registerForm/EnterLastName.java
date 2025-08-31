package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterLastName implements Interaction {
    private final String lastName;

    public EnterLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    @Step("{0} ingresa el apellido")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(lastName).into(ParabankRegisterPage.LAST_NAME_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

