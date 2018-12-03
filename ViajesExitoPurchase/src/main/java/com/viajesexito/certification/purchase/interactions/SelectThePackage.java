package com.viajesexito.certification.purchase.interactions;



import static net.serenitybdd.core.steps.Instrumented.instanceOf;
import static net.serenitybdd.screenplay.actions.Click.on;

import java.util.List;
import java.util.Random;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

public class SelectThePackage implements Interaction{

	protected Target target;	
	
	public SelectThePackage(Target target) {
		this.target = target;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElementFacade> packages = target.resolveAllFor(actor);
		Random random = new Random();
		int ale = random.nextInt(packages.size());
		actor.attemptsTo(on(packages.get(ale)));
	}

	public static Performable con(Target target)
	{
		return instanceOf(SelectThePackage.class).withProperties(target);
	}
}

