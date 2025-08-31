package co.com.parabank.tasks.parabankLogin;

import co.com.parabank.interactions.userInterface.parabankLogin.interactionsManager.LoginDoing;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class OpenRegister implements Task {

    public OpenRegister() {

    }

    public static OpenRegister option() {
        return new OpenRegister();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        LoginDoing.clickOnRegisterOption().performAs(actor);
    }
}

