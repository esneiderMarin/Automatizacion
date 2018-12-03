package com.viajesexito.certification.purchase.tasks;

import static com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage.DESTINY;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage.ORIGINCITY;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import com.viajesexito.certification.purchase.interactions.SelectCity;
import com.viajesexito.certification.purchase.interactions.SelectDate;
import com.viajesexito.certification.purchase.interactions.Wait;
import com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage;
import com.viajesexito.certification.purchase.utils.IgnoreTilde;
import com.viajesexito.certification.purchase.utils.SeparateDate;
import com.viajesexito.certification.purchase.utils.StringToInt;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchPackage implements Task{

	public List<List<String>> datos;
	
	public SearchPackage(List<List<String>> datos) {
		this.datos = datos;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ViajesExitosHomePrincipalPage.PAQUETES), SelectCity.on(ORIGINCITY, Initialize.viajesModelData.get(0).originCity),
				SelectCity.on(DESTINY, Initialize.viajesModelData.get(0).destinationCity),
				SelectDate.on(ViajesExitosHomePrincipalPage.SELECT_DEPARTURE_DATE_TXT_FIELD, Initialize.viajesModelData.get(0).DateOrigin),
				Click.on(ViajesExitosHomePrincipalPage.SELECT_RETURN_DATE_OK.of(String.valueOf(StringToInt.ConvertNumberStringToInt(SeparateDate.getMonth(Initialize.viajesModelData.get(0).DateBack))-1),String.valueOf(StringToInt.ConvertNumberStringToInt(SeparateDate.getDay(Initialize.viajesModelData.get(0).DateBack)))))
				,Click.on(ViajesExitosHomePrincipalPage.BTN_APPLY),
				Click.on(ViajesExitosHomePrincipalPage.BTN_SEARCH)
				);	
	}

	public static SearchPackage on(List<List<String>> datos)
	{
		return Instrumented.instanceOf(SearchPackage.class).withProperties(datos);		
	}
}
