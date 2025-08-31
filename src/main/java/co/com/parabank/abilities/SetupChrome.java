package co.com.parabank.abilities;

import net.serenitybdd.screenplay.Ability;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SetupChrome implements Ability {

    private SetupChrome() {

    }

    public static ChromeOptions chromeOptions(List<String> arguments) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(arguments);

        return options;
    }
}