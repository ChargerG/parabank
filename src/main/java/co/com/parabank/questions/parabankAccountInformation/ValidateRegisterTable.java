package co.com.parabank.questions.parabankAccountInformation;

import co.com.parabank.pages.ParabankAccountInformationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

public class ValidateRegisterTable implements Question<Boolean> {

    public ValidateRegisterTable() {

    }

    public static ValidateRegisterTable toLoadSuccessfull() {
        return new ValidateRegisterTable();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ParabankAccountInformationPage.REGISTER_TABLE_TABLE.waitingForNoMoreThan(Duration.ofSeconds(12))
                .resolveFor(actor).isVisible();
    }
}
