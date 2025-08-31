package co.com.parabank.interactions.userInterface.parabankLogin.interactionsManager;

import co.com.parabank.interactions.userInterface.parabankLogin.login.ClickOnLoginButton;
import co.com.parabank.interactions.userInterface.parabankLogin.login.ClickOnRegisterOption;
import co.com.parabank.interactions.userInterface.parabankLogin.login.EnterPassword;
import co.com.parabank.interactions.userInterface.parabankLogin.login.EnterUserName;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginDoing {

    private LoginDoing() {

    }

    public static EnterUserName enterUserName(String userName) {
        return instrumented(EnterUserName.class, userName);
    }

    public static EnterPassword enterPassword(String password) {
        return instrumented(EnterPassword.class, password);
    }

    public static ClickOnLoginButton clickOnLoginButton() {
        return instrumented(ClickOnLoginButton.class);
    }

    public static ClickOnRegisterOption clickOnRegisterOption() {
        return instrumented(ClickOnRegisterOption.class);
    }
}