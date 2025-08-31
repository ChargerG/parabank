package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterPhoneNumber implements Interaction {
    private final String phoneNumber;

    public EnterPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    @Step("{0} ingresa el numero de contacto")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(phoneNumber).into(ParabankRegisterPage.PHONE_NUMBER_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

