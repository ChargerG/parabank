package co.com.parabank.questions.parabankLogin;

import co.com.parabank.pages.ParabankLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

public class ValidateThatTheUser implements Question<Boolean> {

    public ValidateThatTheUser() {

    }

    public static ValidateThatTheUser isInTheLogin() {
        return new ValidateThatTheUser();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ParabankLoginPage.LOGIN_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(12))
                .resolveFor(actor).isVisible();
    }
}
