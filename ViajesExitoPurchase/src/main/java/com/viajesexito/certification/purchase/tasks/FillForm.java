package com.viajesexito.certification.purchase.tasks;

import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_AGREEMENT;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_BIRTH_DAY;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_BIRTH_MONTH;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_BIRTH_YEAR;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_BUY_NOW;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.BTN_COMBO;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.SELECT_COMBO;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_BIRTH_DAY;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_BIRTH_MONTH;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_BIRTH_YEAR;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_EMAIL;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_ID;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_LAST_NAME;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_NAME;
import static com.viajesexito.certification.purchase.userinterface.ViajesExitoForm.TXT_PHONE;

import com.viajesexito.certification.purchase.interactions.Wait;
import com.viajesexito.certification.purchase.interactions.WriterText;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class FillForm implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BTN_COMBO),
				Click.on(SELECT_COMBO),
				WriterText.on(TXT_NAME, ""),
				WriterText.on(TXT_LAST_NAME, ""),
				WriterText.on(TXT_PHONE, ""),
				WriterText.on(TXT_EMAIL, ""),
				WriterText.on(TXT_ID, ""),
				Click.on(BTN_BIRTH_DAY),
				Click.on(TXT_BIRTH_DAY),
				Click.on(BTN_BIRTH_MONTH),
				Click.on(TXT_BIRTH_MONTH),
				Click.on(BTN_BIRTH_YEAR),
				Click.on(TXT_BIRTH_YEAR),
				Click.on(BTN_AGREEMENT),
				Click.on(BTN_BUY_NOW),
				Wait.on(7));
		
	}

	public static FillForm on() {
		return Instrumented.instanceOf(FillForm.class).withProperties();				
	}	
}
