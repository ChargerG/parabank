package co.com.parabank.questions.parabankRegister;

import co.com.parabank.pages.ParabankRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

public class ValidateRegisterButton implements Question<Boolean> {

    public ValidateRegisterButton() {

    }

    public static ValidateRegisterButton thereIsNotVisible(){
        return new ValidateRegisterButton();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        ParabankRegisterPage.REGISTER_BUTTON.resolveFor(actor).waitUntilNotVisible().withTimeoutOf(Duration.ofSeconds(12));
        return ParabankRegisterPage.REGISTER_BUTTON.resolveFor(actor).isVisible();
    }
}
