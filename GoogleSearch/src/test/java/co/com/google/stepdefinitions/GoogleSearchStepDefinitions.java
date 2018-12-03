package co.com.google.stepdefinitions;

import org.glassfish.grizzly.nio.SelectorHandlerTask;
import org.openqa.selenium.WebDriver;

import co.com.google.tasks.Find;
import co.com.google.tasks.GoTo;
import co.com.google.tasks.OpenTheBrowser;
import co.com.google.userinterfaces.GoogleAppsComponent;
import co.com.google.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsCollectionContaining.hasItem;



public class GoogleSearchStepDefinitions {

	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor esneider = Actor.named("esneider");

	private GoogleHomePage googleHomePage;

	@Before
	public void setUp() {
		esneider.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("that Esneider want to search a word")
	public void thatEsneiderWantToSearchAWord() throws Exception {
		esneider.wasAbleTo(OpenTheBrowser.on(googleHomePage));
		
	}

	@When("he find for the word hola mundo")
	public void heFindForTheWordHolaMundo() throws Exception {
		esneider.wasAbleTo(Find.the());
		
	}

	@Then("he should see the word Hola mundo in the screen")
	public void heShouldSeeTheWordHolaMundoInTheScreen() throws Exception {
		//esneider.should(see);
	}



}
