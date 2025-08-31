package co.com.parabank.pages;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.cssSelector;

public class ParabankRegisterPage {

    public static Target FIRST_NAME_INPUT = Target
            .the("Campo donde el usuario ingresa primer nombre")
            .located(cssSelector("input#customer\\.firstName"));

    public static Target LAST_NAME_INPUT = Target
            .the("Campo donde el usuario ingresa apellido")
            .located(cssSelector("input#customer\\.lastName"));

    public static Target ADDRESS_INPUT = Target
            .the("Campo donde el usuario ingresa la direcccion")
            .located(cssSelector("input#customer\\.address\\.street"));

    public static Target CITY_INPUT = Target
            .the("Campo donde el usuario ingresa la ciudad")
            .located(cssSelector("input#customer\\.address\\.city"));

    public static Target STATE_INPUT = Target
            .the("Campo donde el usuario ingresa el estado")
            .located(cssSelector("input#customer\\.address\\.state"));

    public static Target CODE_INPUT = Target
            .the("Campo donde el usuario ingresa el codigo")
            .located(cssSelector("input#customer\\.address\\.zipCode"));

    public static Target PHONE_NUMBER_INPUT = Target
            .the("Campo donde el usuario ingresa el numero de contacto")
            .located(cssSelector("input#customer\\.phoneNumber"));

    public static Target SOCIAL_SECURITY_NUMBER_INPUT = Target
            .the("Campo donde el usuario ingresa el SSN")
            .located(cssSelector("input#customer\\.ssn"));

    public static Target USER_NAME_INPUT = Target
            .the("Campo donde el usuario ingresa usuario")
            .located(cssSelector("input#customer\\.username"));

    public static Target USER_NAME_ERROR_LABEL = Target
            .the("Error que indica que el usuario ya existe")
            .located(cssSelector("span#customer\\.username\\.errors"));

    public static Target PASSWORD_INPUT = Target
            .the("Campo donde el usuario ingresa la clave")
            .located(cssSelector("input#customer\\.password"));

    public static Target REPEATED_PASSWORD_INPUT = Target
            .the("Campo donde el usuario ingresa la confirmacion de la clave")
            .located(cssSelector("#repeatedPassword"));

    public static Target REGISTER_BUTTON = Target
            .the("Boton para realizar el registro")
            .located(cssSelector("input.button[value='Register']"));
}
