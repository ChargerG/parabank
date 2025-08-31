package co.com.parabank.questions.parabankHome;

import co.com.parabank.pages.ParabankHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

public class ValidateRegister implements Question<String> {

    public ValidateRegister() {

    }

    public static ValidateRegister successfull() {
        return new ValidateRegister();
    }

    @Override
    public String answeredBy(Actor actor) {
        return ParabankHomePage.SUCCESS_MESSAGE_HEADER.waitingForNoMoreThan(Duration.ofSeconds(12))
                .resolveFor(actor).getText();
    }
}
