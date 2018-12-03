package userinterfaces;

import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class RoyalFilmsHomePage extends PageObject {
	
	@Managed(driver = "chrome")
	private WebDriver hisBrowser;
	private Actor esneider = Actor.named("esneider");

	private RoyalFilmsHomePage royalFilmsHomePage;

}
