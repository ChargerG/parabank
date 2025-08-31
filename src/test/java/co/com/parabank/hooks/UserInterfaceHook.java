package co.com.parabank.hooks;

import co.com.parabank.utils.KeyToRemember;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserInterfaceHook {

    private final EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    private final String parabankUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("parabank.url");

    @Before("@FeatureName:LoginManagement")
    public void setupEnvironment() {
        theActorInTheSpotlight().remember(KeyToRemember.PARABANK_URL.name(), parabankUrl);
    }

    @After()
    public void killDriver() {
        if (BrowseTheWeb.as(theActorInTheSpotlight()).getDriver() != null)
            BrowseTheWeb.as(theActorInTheSpotlight()).getDriver().quit();
    }
}