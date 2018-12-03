package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com	")
public class GoogleHomePage extends PageObject {
	public static final Target GOOGLE_NOT_NOW_MANAGE_PRIVACITY = Target.the("Google not now manage privacity ").locatedBy("//a[@class='gb_wa gb_kd gb_od']");
	public static final Target GOOGLE_BLANK_AREA = Target.the("Google blank area").locatedBy("//div[@id='lga']");
	
}
