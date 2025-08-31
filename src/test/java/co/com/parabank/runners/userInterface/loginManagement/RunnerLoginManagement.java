package co.com.parabank.runners.userInterface.loginManagement;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/userInterface/loginManagement/LoginManagement.feature",
        glue = {"co.com.parabank.stepDefinitions.userInterface",
                "co.com.parabank.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@FeatureName:LoginManagement"
)
public class RunnerLoginManagement {
}
