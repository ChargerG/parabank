package co.com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ParabankHomePage {
    public static Target SUCCESS_MESSAGE_HEADER = Target
            .the("Mensaje que indica que el registro fue exitoso")
            .located(cssSelector("div#rightPanel h1"));
}
