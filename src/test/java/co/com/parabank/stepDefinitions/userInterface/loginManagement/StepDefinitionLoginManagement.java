package co.com.parabank.stepDefinitions.userInterface.loginManagement;

import co.com.parabank.interactions.userInterface.parabankLogin.interactionsManager.LoginDoing;
import co.com.parabank.questions.parabankAccountInformation.ValidateRegisterTable;
import co.com.parabank.tasks.navigate.NavigateTo;
import co.com.parabank.tasks.parabankLogin.Login;
import co.com.parabank.tasks.parabankLogout.Logout;
import co.com.parabank.tasks.parabankRegister.EnterRegisterInformation;
import co.com.parabank.utils.KeyToRemember;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitionLoginManagement {

    @Dado("que {actor} accede a la pagina de registro de ParaBank")
    public void accedeALaPaginaDeRegistroDeParaBank(Actor actor) {
        actor.attemptsTo(
                NavigateTo.parabank(),
                LoginDoing.clickOnRegisterOption()
        );
    }

    @Cuando("completa el formulario con datos validos y envia el registro")
    public void completaElFormularioConDatosValidosYEnviaElRegistro() {
        EnterRegisterInformation.inParabank().performAs(theActorInTheSpotlight());
    }

    @Entonces("puede iniciar sesion con sus credenciales y acceder al sistema")
    public void puedeIniciarSesionConSusCredencialesYAccederAlSistema() {
        theActorInTheSpotlight().attemptsTo(
                Logout.toExitTheSystem(),
                Login.withTheCredentials(
                        theActorInTheSpotlight().recall(KeyToRemember.USERNAME.name()),
                        theActorInTheSpotlight().recall(KeyToRemember.PASSWORD.name())
                )
        );

        theActorInTheSpotlight().should(
                seeThat("El usuario visualiza tabla de registros bancarios",
                        ValidateRegisterTable.toLoadSuccessfull(),
                        equalTo(Boolean.TRUE)
                )
        );
    }
}