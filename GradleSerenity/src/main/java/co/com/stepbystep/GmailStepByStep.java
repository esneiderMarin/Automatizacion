package co.com.stepbystep;
import co.com.gmail.GmailPages;
import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Step;
//


public class GmailStepByStep {


	GmailPages page;
	String user= "esneider.selenium@gmail.com";
	String password = "1234567890S_";
	
	public void openUrl() {
		page.open();
	}
	
	@Step("Writing data to login in Gmail")
	public void inputData(String user, String password) throws InterruptedException {
		page.loginInGmail(user, password);
	}

	@Step("Validate field")
	public void assertData(String textToValidate) throws InterruptedException {
		page.assertLogin(textToValidate);
	}
}
