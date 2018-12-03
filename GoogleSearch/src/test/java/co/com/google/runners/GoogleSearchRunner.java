package co.com.google.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/google_search.feature",
		glue = "co.com.google.stepdefinitions",
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","json:target/json-report/LoginReport.json",
		"html:target/cucumber-reports"}
		)
public class GoogleSearchRunner {
}
