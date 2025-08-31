package co.com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ParabankLoginPage {
    public static Target USER_NAME_INPUT = Target
            .the("Campo donde el usuario ingresa su usuario")
            .located(cssSelector("form[name='login'] input[name='username']"));

    public static Target PASSWORD_INPUT = Target
            .the("Campo donde el usuario ingresa su clave")
            .located(cssSelector("form[name='login'] input[name=password]"));

    public static Target LOGIN_BUTTON = Target
            .the("Boton para iniciar sesion")
            .located(cssSelector("form[name='login'] input.button"));

    public static Target REGISTER_URL = Target
            .the("Link de acceso a Registrarse")
            .located(cssSelector("#loginPanel > p:nth-child(3) a[href]"));
}
