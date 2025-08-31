package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterAddress implements Interaction {
    private final String address;

    public EnterAddress(String address) {
        this.address = address;
    }

    @Override
    @Step("{0} ingresa la direccion")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(address).into(ParabankRegisterPage.ADDRESS_INPUT).performAs(actor);
    }
}

