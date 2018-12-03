package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp( ) {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that Susan want to translate a word$")
	public void thatSusanWantToTranslateAWord() throws Exception {
		// Preconditions: Be in Google translate
		// 1: Open the browser in Google´s home http://google.com.co
		
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
		// 2: Go to Google translate
		
	}

	@When("^she translates the word chesse to spanish$")
	public void sheTranslatesTheWordChesseToSpanish() throws Exception {
		susan.wasAbleTo(Translate.the());
		// Conditions : Translate a word from english to spanish
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
		// Consequences: The translated word appears --> Check it
	}

}
