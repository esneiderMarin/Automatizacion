package co.com.google.tasks;

import org.openqa.selenium.remote.server.handler.SubmitElement;

import co.com.google.userinterfaces.GoogleHomePage;
import co.com.google.userinterfaces.GoogleResultPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Find implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {


		actor.attemptsTo(
				Enter.theValue("Hola mundo").into(GoogleHomePage.GOOGLE_SEARCH_TEXTAREA),
				Click.on(GoogleHomePage.GOOGLE_BLANK_AREA),
				Click.on(GoogleHomePage.GOOGLE_SUMBIT_BUTTON));	
		
	}

	public static Find the() {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Find.class);
	}

}
