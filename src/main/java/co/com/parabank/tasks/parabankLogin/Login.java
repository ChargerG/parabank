package co.com.parabank.tasks.parabankLogin;

import co.com.parabank.interactions.userInterface.parabankLogin.interactionsManager.LoginDoing;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Login implements Task {

    private final String user;
    private final String password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Login withTheCredentials(String user, String password) {
        return new Login(user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginDoing.enterUserName(user),
                LoginDoing.enterPassword(password),
                LoginDoing.clickOnLoginButton()
        );
    }
}

