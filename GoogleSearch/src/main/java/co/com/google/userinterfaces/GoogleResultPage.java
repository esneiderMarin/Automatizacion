package co.com.google.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleResultPage {
	
	public static final Target GOOGLE_RESULT_FIELD = Target.the("Google result text area").locatedBy("//div[@class='FxvUNb kno-ecr-pt kno-fb-ctx']");
	public static final Target ROYAL_SELECT_FIELD = Target.the("Google result text area").locatedBy("//select[@class='ng-pristine ng-valid ng-touched']");
	
		
	
}
