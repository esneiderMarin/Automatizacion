package com.viajesexito.certification.purchase.interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage;
import com.viajesexito.certification.purchase.utils.IgnoreTilde;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class SelectCity implements Interaction{

	private Target target;
	private String city;
	
	public SelectCity(Target target, String city) {
		this.target = target;
		this.city = city;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(IgnoreTilde.convertTilde(city)).into(target),
				ManagmentRobot.on("Enter"));	
	}

	public static Performable on(Target target, String city)
	{
		return Instrumented.instanceOf(SelectCity.class).withProperties(target, city);
	}
}
