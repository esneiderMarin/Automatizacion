package com.viajesexito.certification.purchase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ViajesExitoSelectAPackage {
	public static final Target SELECT_FLY = Target.the("").locatedBy("//div[@id='divAirResults']//div[@class='airOptionsColumn']");
	//div[@id='divAirResults']//div[@class='airOptionsColumn']//input[contains(@id,'Air_9_sector_0')]
	public static final Target FLY_GO = Target.the("").locatedBy("//div[@id='divAirResults']//div[@class='airOptionsColumn']//input[contains(@id,'Air_{0}_sector_0')]");
	public static final Target SELECT_FLY_GO = Target.the("").locatedBy("//div[@id='divAirResults']//div[@class='airOptionsColumn']//input[contains(@id,'Air_{0}_sector_0_opt_{1}')]");
	public static final Target FLY_BACK = Target.the("").locatedBy("//div[@id='divAirResults']//div[@class='airOptionsColumn']//input[contains(@id,'Air_{0}_sector_1')]");
	public static final Target SELECT_FLY_BACK = Target.the("").locatedBy("//div[@id='divAirResults']//div[@class='airOptionsColumn']//input[contains(@id,'Air_{0}_sector_1_opt_{1}')]");
	public static final Target PRICES = Target.the("").locatedBy("//a[@id='divAirMatrix-label']");

	public static final Target BTN_SELECT_FLIGHT = Target.the("").locatedBy("//div[@class='airOption nts-card-rounded' and @data-airresult='Air_{0}']//input[@class='button nts-button expanded small']");
	public static final Target BTN_SELECT_HOTEL = Target.the("").locatedBy("//div[@data-uniqueid='Hot_171']//button[@class='button nts-button small expanded']");	
	public static final Target BTN_RESERVA = Target.the("").locatedBy("//input[@id='Hot_95_room_0_option_24']");
	public static final Target BTN_NO_CAR = Target.the("").locatedBy("//a[text()='No, continuar sin rentar un auto']");
	public static final Target BTN_BUY_NOW = Target.the("").locatedBy("//div[@id='divSelectedPackage']//a[text()='Comprar Ahora']");
	

	
	
}
