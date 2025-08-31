package co.com.parabank.interactions.userInterface.parabankRegister.registerForm;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

public class EnterCity implements Interaction {
    private final String city;

    public EnterCity(String city) {
        this.city = city;
    }

    @Override
    @Step("{0} ingresa la ciudad")
    public <T extends Actor> void performAs(T actor) {
        Enter.theValue(city).into(ParabankRegisterPage.CITY_INPUT.waitingForNoMoreThan(Duration.ofSeconds(12)))
                .performAs(actor);
    }
}

