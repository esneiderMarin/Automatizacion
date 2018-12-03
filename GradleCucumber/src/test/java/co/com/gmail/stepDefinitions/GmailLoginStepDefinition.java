package co.com.gmail.stepDefinitions;

import com.google.pages.LoginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLoginStepDefinition {

	@Given("That I am in gmail")
	public void thatIAmInGmail() {
	    // Write code here that turns the phrase above into concrete actions
		LoginPOM.initializeBrowserInUrl("https://www.google.com/intl/es/gmail/about/#");
	}

	@When("I enter my (.*) and (.*)")
	public void iEnteredMyUserAndPassword(String user, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginPOM.loginInGmail(user, password);
	}

	@Then("So when I login I should see (.*) in the screen")
	public void soWhenILoginIShouldSee(String textToValidate) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		LoginPOM.assertLogin(textToValidate);
	}
	
	
	
}
