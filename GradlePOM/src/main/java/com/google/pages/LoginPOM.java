package com.google.pages;

import static org.junit.Assert.assertEquals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.captures.Screenshots;

public class LoginPOM {

	public static WebDriver skyNet;
	public LoginPOM() {
		
	}
	
	public static void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		skyNet = new ChromeDriver();
	}
	
	public  static void openUrl(String url) {
		skyNet.get(url);
	}
	
	public static void closeBroswer() { 
		skyNet.close(); 
	}
	
	public static void maximizeWindow() { 
		skyNet.manage().window().maximize();
	}
	
	public static void goToTheGmailPage()
	{
		skyNet.findElement(By.xpath("//a[@data-g-label='Sign in']")).click();
	}
	
	public static void writeUserName(String user) 
	{
		skyNet.findElement(By.id("identifierId")).sendKeys(user);
	}
	
	public static void clickInTheNextButtonInWriteUserPage() {
		skyNet.findElement(By.id("identifierNext")).click();
	}
	
	public static void writePassword(String password) {
		skyNet.findElement(By.xpath("//input[@aria-label='Introduce tu contraseña']")).sendKeys(password);		
	}
	
	public static void clickInTheNextButtonInWritePasswordPage() {
		skyNet.findElement(By.id("passwordNext")).click();
	}

	public static String getLabelPrincipal() {
		return skyNet.findElement(By.xpath("//div[contains(text(),'Principal') and contains(@id,':2')]")).getText();
	}
	
	public static void clickUserButton() throws InterruptedException {
		Thread.sleep(10000);
		skyNet.findElement(By.xpath("//span[@class=\"gb_ab gbii\" and @xpath=\"1\"]")).click();
	}
	
	
	public static void assertLogin(String texto) throws InterruptedException
	{
		Thread.sleep(15000);
		assertEquals("I did not find the label 'Principal' then you are not logged on", texto, getLabelPrincipal());
		takeScreenshot("captureAssert");
		closeBroswer();
	}
	
	public static void initializeBrowserInUrl(String url)
	{
		initializeBrowser();
		openUrl(url);
		maximizeWindow();
		takeScreenshot("initializeBrowser");
	}
	
	public static void loginInGmail(String user, String password) throws InterruptedException
	{
		goToTheGmailPage();
		takeScreenshot("goToTheGmailPage");
		writeUserName(user);
		takeScreenshot("writeUserName");
		clickInTheNextButtonInWriteUserPage();
		takeScreenshot("doClickInTheNextButtonInWriteUserPage");
		Thread.sleep(2000);
		writePassword(password);
		takeScreenshot("writepassword");
		clickInTheNextButtonInWritePasswordPage();
		takeScreenshot("clickInTheNextButtonInWritepasswordPage");
		//clickUserButton();
		
	}
	
	public static void takeScreenshot(String capturaName)
	{
		try {
			Thread.currentThread().sleep(2*1000);
			int aleatorio = (int) (1000*Math.random());
			int aleatorio2 = (int) (1000*Math.random());
			String FILENAME="C:/Users/SBMEDADMIN/eclipse-workspace/GradlePOM/ScreenShots/"+capturaName+aleatorio+"a"+aleatorio2+".png";
			Screenshots.captureScreen(FILENAME);
			System.out.println("[ Captura finalizada ]");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
