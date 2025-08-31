package co.com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ParabankLogoutPage {
    public static Target LOGOUT_BUTTON = Target
            .the("Boton para cerrar sesion")
            .located(cssSelector("#leftPanel > ul > li:nth-child(8) a[href]"));
}
