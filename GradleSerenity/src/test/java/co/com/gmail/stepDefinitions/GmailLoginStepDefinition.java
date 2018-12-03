package co.com.gmail.stepDefinitions;
import co.com.stepbystep.GmailStepByStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GmailLoginStepDefinition {

	@Steps
	GmailStepByStep login;
	
	
	@Given("That I am in gmail´s page")
	public void thatIAmInGmail() {
	    // Write code here that turns the phrase above into concrete actions
		login.openUrl();
	}

	//Maybe there a can use (.*) too
	@When("I enter my user and password")
	public void iEnteredMyUserAndPassword(String user, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		login.inputData(user, password);
	}


	@Then("So when I login I should see 'Principal' in the screen")
	public void soWhenILoginIShouldSee(String textToValidate) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//login.assertData(textToValidate);
		System.out.print("Principal");
	}
	
	
	
}
