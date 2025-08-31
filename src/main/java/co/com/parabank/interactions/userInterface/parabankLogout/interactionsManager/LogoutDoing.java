package co.com.parabank.interactions.userInterface.parabankLogout.interactionsManager;

import co.com.parabank.interactions.userInterface.parabankLogout.logout.ClickOnLogoutButton;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogoutDoing {

    private LogoutDoing() {

    }

    public static ClickOnLogoutButton clickOnLogoutButton() {
        return instrumented(ClickOnLogoutButton.class);
    }
}