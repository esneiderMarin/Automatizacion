package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/SelectFilm.feature",
		glue = "stepDefinitions",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","json:target/json-report/LoginReport.json",
		"html:target/cucumber-reports"}
		)
public class RoyalFilmsSelectFilmRunner {
}
