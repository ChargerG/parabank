package co.com.parabank.tasks.parabankLogout;

import co.com.parabank.interactions.userInterface.parabankLogout.interactionsManager.LogoutDoing;
import co.com.parabank.questions.parabankLogin.ValidateThatTheUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Logout implements Task {
    public Logout() {

    }

    public static Logout toExitTheSystem() {
        return new Logout();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LogoutDoing.clickOnLogoutButton(),
                Ensure.that("El boton de LOGIN es visible", ValidateThatTheUser.isInTheLogin()).isTrue()
        );
    }
}

