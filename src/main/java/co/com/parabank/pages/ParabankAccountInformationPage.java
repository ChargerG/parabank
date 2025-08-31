package co.com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ParabankAccountInformationPage {
    public static Target REGISTER_TABLE_TABLE = Target
            .the("Tabla con los registros de la cuenta")
            .located(cssSelector("table#accountTable"));
}
