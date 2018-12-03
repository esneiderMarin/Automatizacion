package com.viajesexito.certification.purchase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ViajesExitoForm {

	public static final Target BTN_COMBO = Target.the("").locatedBy("//select[@id='Travelers_0__Title']");
	public static final Target SELECT_COMBO = Target.the("").locatedBy("//select[@id='Travelers_0__Title']//option[@value='0']");
	public static final Target TXT_NAME = Target.the("").locatedBy("//input[@data-paxtype='ADT' and @id='Travelers_0__FirstName']");
	public static final Target TXT_LAST_NAME = Target.the("").locatedBy("//input[@id='Travelers_0__LastName']");
	public static final Target TXT_PHONE = Target.the("").locatedBy("//input[@id='Travelers_0__Phone']");
	public static final Target TXT_EMAIL = Target.the("").locatedBy("//input[@id='Travelers_0__Email']");
	public static final Target TXT_ID = Target.the("").locatedBy("//input[@id='Travelers_0__DucumentNumber']");
	public static final Target BTN_BIRTH_DAY = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_d']");
	public static final Target TXT_BIRTH_DAY = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_d']//option[@value='5']");
	public static final Target BTN_BIRTH_MONTH = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_m']");
	public static final Target TXT_BIRTH_MONTH = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_m']//option[@value='6']");
	public static final Target BTN_BIRTH_YEAR = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_y']");
	public static final Target TXT_BIRTH_YEAR = Target.the("").locatedBy("//select[@id='Travelers[0].DOB_y']//option[@value='1982']");
	public static final Target BTN_AGREEMENT = Target.the("").locatedBy("//input[@data-val-required='The TermsAndConditions field is required.']");
	public static final Target BTN_BUY_NOW = Target.the("").locatedBy("//input[@id='submitButtonId']']");
	}
