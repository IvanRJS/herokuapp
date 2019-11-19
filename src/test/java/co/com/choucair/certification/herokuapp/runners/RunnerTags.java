package co.com.choucair.certification.herokuapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/herokuapp.feature"},
        tags = {"@Tag0"},
        glue = {"co.com.choucair.certification.herokuapp.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
