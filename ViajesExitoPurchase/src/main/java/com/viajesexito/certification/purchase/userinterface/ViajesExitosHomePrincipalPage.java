package com.viajesexito.certification.purchase.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ViajesExitosHomePrincipalPage {

	public static final Target PAQUETES = Target.the("").locatedBy("//ul[@class='nav nav-tabs widget-tabs hidden-xs desktop-tabs']//a[@aria-controls='airhotel']");
	public static final Target ORIGINCITY = Target.the("").locatedBy("//input[@id='txtAirHotelCityFrom']");
	public static final Target DESTINY = Target.the("").locatedBy("//input[@id='txtAirHotelCityTo']");
	public static final Target SELECTORIGINCITYMED = Target.the("").locatedBy("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li[@class='ui-menu-item' and contains(text(), '{0}')]");
	
	//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']//li[@class='ui-menu-item' and contains(text(), 'Mexico')]
	public static final Target SELECT_DEPARTURE_DATE = Target.the("").locatedBy("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[6]/a");
	public static final Target SELECT_DEPARTURE_DATE_OK = Target.the("").locatedBy("//div[@class='ui-datepicker-group ui-datepicker-group-first']//table[@class='ui-datepicker-calendar' ]//a[.='{0}']");
	public static final Target SELECT_RETURN_DATE_OK = Target.the("").locatedBy("//td[@data-month='{0}']//a[text()='{1}']");
	public static final Target SELECT_DEPARTURE_DATE_TXT_FIELD = Target.the("").locatedBy("//input[@id='txtAirHotelDateFrom']");
	public static final Target SELECT_RETURN_DATE_TXT_FIELD = Target.the("").locatedBy("//input[@id='txtAirHotelDateTo']");
	public static final Target BTN_NEXT_MONTH = Target.the("").locatedBy("//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-icon ui-icon-circle-triangle-e']");
	public static final Target CLICK_OUTSIDE = Target.the("").locatedBy("//section[@class='slider-wrapper']");
	public static final Target CHECK_ONLY_BAG = Target.the("").locatedBy("//input[@id='chkAirBaggageIncluded']");
	
	

	public static final Target MONTH_PICKER = Target.the("").locatedBy("//span[@class='ui-datepicker-month']");
	public static final Target YEAR_PICKER = Target.the("").locatedBy("//span[@class='ui-datepicker-year']");
	public static final Target DAY_PICKER = Target.the("").locatedBy("//table[@class='ui-datepicker-calendar']//td//a[text()='5']");
	
	public static final Target BTN_APPLY = Target.the("").locatedBy("//div[@class='pop-up-main']//button[@class='btn btn-default pull-right']");
	public static final Target BTN_SEARCH = Target.the("").locatedBy("//div[@class='airhotel-btn-control btn-search-container']//input[@type='button']");
	
	public static final Target TXT_VALIDACION_PAGE_ON = Target.the("").locatedBy("//a[@id='dnn_dnnMYBOOKINSNew_lbtMyBookings']");
	public static final Target TXT_VALIDACION_PAGE_FINAL = Target.the("").locatedBy("//span[@id='ctl00_ctl00_NetSiteContentPlaceHolder_NetFulfillmentContentPlaceHolder_lblCheckOutTitle']");

	
	//div[@class='air-btn-control btn-search-container']//input[@type='button']
	//div[@class='pop-up-action pop-up-action-flex']//button[@class='btn btn-default']
	
	
	//div[@class='ui-datepicker-group ui-datepicker-group-last']//span[@class='ui-icon ui-icon-circle-triangle-e']
	//INPUT[@id='txtAirDateFrom']

	//*[@id="ui-datepicker-div"]/div[1]/table/tbody/tr[4]/td[6]/a
}
