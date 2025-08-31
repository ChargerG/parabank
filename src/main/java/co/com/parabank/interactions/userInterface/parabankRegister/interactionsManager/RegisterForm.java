package co.com.parabank.interactions.userInterface.parabankRegister.interactionsManager;

import co.com.parabank.interactions.userInterface.parabankRegister.registerForm.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterForm {

    private RegisterForm() {

    }

    public static EnterFirstName enterFirstName(String firstName) {
        return instrumented(EnterFirstName.class, firstName);
    }

    public static EnterLastName enterLastName(String lastName) {
        return instrumented(EnterLastName.class, lastName);
    }

    public static EnterAddress enterAddress(String address) {
        return instrumented(EnterAddress.class, address);
    }

    public static EnterCity enterCity(String city) {
        return instrumented(EnterCity.class, city);
    }

    public static EnterState enterState(String state) {
        return instrumented(EnterState.class, state);
    }

    public static EnterCode enterCode(String code) {
        return instrumented(EnterCode.class, code);
    }

    public static EnterPhoneNumber enterPhoneNumber(String phoneNumber) {
        return instrumented(EnterPhoneNumber.class, phoneNumber);
    }

    public static EnterSocialSecurityNumber enterSocialSecurityNumber(String socialSecurityNumber) {
        return instrumented(EnterSocialSecurityNumber.class, socialSecurityNumber);
    }

    public static EnterUserName enterUserName(String userName) {
        return instrumented(EnterUserName.class, userName);
    }

    public static EnterPassword enterPassword(String password) {
        return instrumented(EnterPassword.class, password);
    }

    public static EnterPasswordAgain enterPasswordAgain(String password) {
        return instrumented(EnterPasswordAgain.class, password);
    }

    public static ClickOnRegisterButton clickOnRegisterButton() {
        return instrumented(ClickOnRegisterButton.class);
    }
}