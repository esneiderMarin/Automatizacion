package com.viajesexito.certification.purchase.interactions;

import java.util.List;
import java.util.Random;

import com.viajesexito.certification.purchase.userinterface.ViajesExitoSelectAPackage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectFly implements Interaction{

	private Target targetOne;
	private Target targetTwo;
	private int option;

	public SelectFly(Target targetOne, Target targetTwo, int option) {
		this.targetOne = targetOne;
		this.targetTwo = targetTwo;
		this.option = option;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> flights = targetOne.of(String.valueOf(option)).resolveAllFor(actor);
		Random random = new Random();
		int value = random.nextInt(flights.size() + 1);
		System.out.println("valor ida: "+value);
		actor.attemptsTo(Click.on(targetTwo.of(String.valueOf(option),String.valueOf(value)))				);
	}

	public static Performable on(Target targetOne, Target targetTwo, int option)
	{
		return Instrumented.instanceOf(SelectFly.class).withProperties(targetOne,targetTwo, option);
	}
}
