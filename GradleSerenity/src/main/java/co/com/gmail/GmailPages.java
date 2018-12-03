package co.com.gmail;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.google.com/intl/es/gmail/about/#")

public class GmailPages extends PageObject{

	@FindBy(xpath="//a[@data-g-label='Sign in']")
	static WebElement btnLoginGmail;
	
	@FindBy(id="identifierId")
	static WebElement txtUser;
	
	@FindBy(id="identifierNext")
	static WebElement btnNextUser;
	
	@FindBy(xpath="//input[@aria-label='Introduce tu contraseña']")
	static WebElement txtPassword;
	
	@FindBy(id="passwordNext")
	static WebElement btnNextPassword;
	
	@FindBy(xpath="//div[contains(text(),'Principal') and contains(@id,':2')]")
	static WebElement labelUser;	
	
	public static void loginInGmail(String user, String password) throws InterruptedException
	{
		btnLoginGmail.click();
		txtUser.sendKeys(user);
		btnNextUser.click();
		Thread.sleep(2000);
		txtPassword.sendKeys(password);
		btnNextPassword.click();
	}
	
	public static String getLabelUser() {
		return labelUser.getText();
	}
	
	public static void assertLogin(String textToValidate) throws InterruptedException
	{
		Thread.sleep(15000);
		assertEquals("The object was not found, then you are not logged in ", textToValidate, getLabelUser());
	}
}
