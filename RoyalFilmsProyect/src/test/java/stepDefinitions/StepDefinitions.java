package stepDefinitions;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import tasks.SearchForMovie;
import userinterfaces.RoyalFilmsHomePage;

public class StepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor esneider = Actor.named("esneider");

	private RoyalFilmsHomePage royalFilmsHomePage;
	
	@Before
	public void setUp() {
		esneider.can(BrowseTheWeb.with(hisBrowser));
	}

	
	@Given("^that jhon searched for a film$")
	public void thatJhonSearchedForAFilm() throws Exception {
		esneider.wasAbleTo(SearchForMovie.on(royalFilmsHomePage));
	}

	@When("^he clicks on a result$")
	public void heClicksOnAResult() throws Exception {
	}

	@Then("^he checks the description$")
	public void heChecksTheDescription() throws Exception {
	}
}
