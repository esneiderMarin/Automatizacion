package com.viajesexito.certification.purchase.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class WriterText implements Interaction{

	private Target target;
	private String text;
	
	public WriterText(Target target, String text) {
		this.target = target;
		this.text = text;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(text).into(target));		
	}

	public static Performable on(Target target, String text)
	{
		return Instrumented.instanceOf(WriterText.class).withProperties(target,text);
	}
}
