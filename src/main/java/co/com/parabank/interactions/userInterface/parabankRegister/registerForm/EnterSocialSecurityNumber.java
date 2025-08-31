package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterSocialSecurityNumber implements Interaction {
    private final String socialSecurityNumber;

    public EnterSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    @Step("{0} ingresa el numero de seguro social")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(socialSecurityNumber).into(ParabankRegisterPage.SOCIAL_SECURITY_NUMBER_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

