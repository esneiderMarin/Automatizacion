package co.com.bancolombia.certification.googlesuite.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source language button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target language button").located(By.id("gt-tl-gms"));
	public static final Target SOURCE_LANGUAGE = Target.the("Source language").locatedBy("//*[@id='gt-sl-gms-menu']/table//div[contains(text(), 'ingl�s')]");
	public static final Target TARGET_LANGUAGE = Target.the("Source language").locatedBy("//*[@id='gt-tl-gms-menu']/table//div[contains(text(), 'espa�ol')]");
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source language text area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target language result area").located(By.id("gt-res-dir-ctr"));
	public static final Target TRANSLATE_BUTTON = Target.the("Translate button").located(By.id("gt-submit"));
	
	
	
	
	
}
