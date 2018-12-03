package com.viajesexito.certification.purchase.tasks;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElements;

import com.viajesexito.certification.purchase.interactions.SelectFly;
import com.viajesexito.certification.purchase.interactions.Wait;
import com.viajesexito.certification.purchase.userinterface.ViajesExitoSelectAPackage;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class SelectPackage implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		//actor.attemptsTo(WaitUntil.the(ViajesExitoSelectAPackage.PRICES, WebElementStateMatchers.isVisible()));
		actor.attemptsTo(Wait.on(13));
		List<WebElementFacade> options = ViajesExitoSelectAPackage.SELECT_FLY.resolveAllFor(actor);
		Random random = new Random();
		int value = random.nextInt(options.size() + 1);
		System.out.println("valor mandado 1: " + value);
		actor.attemptsTo(SelectFly.on(ViajesExitoSelectAPackage.FLY_GO, ViajesExitoSelectAPackage.SELECT_FLY_GO, value),
				SelectFly.on(ViajesExitoSelectAPackage.FLY_BACK, ViajesExitoSelectAPackage.SELECT_FLY_BACK, value),
				Click.on(ViajesExitoSelectAPackage.BTN_SELECT_FLIGHT.of(String.valueOf(value))),
				Wait.on(6),
				Click.on(ViajesExitoSelectAPackage.BTN_BUY_NOW),
				Wait.on(6));
	}
	
	public static SelectPackage on()
	{
		return Instrumented.instanceOf(SelectPackage.class).withProperties();		
	}
	
}
