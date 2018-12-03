package co.com.google.questions;

import java.io.ObjectInputStream.GetField;

import org.apache.bcel.generic.GETFIELD;
import org.openqa.selenium.remote.server.handler.GetElementText;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Text;

import co.com.google.tasks.Find;
import co.com.google.userinterfaces.GoogleHomePage;
import co.com.google.userinterfaces.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class VerifyTheSearchResult implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(GoogleResultPage.GOOGLE_RESULT_FIELD));
	}

	public static Find theAnswer() {
		// TODO Auto-generated method stub
		//return Text.of(GoogleResultPage.GOOGLE_RESULT_FIELD)viewedBy(actor).asString();
		return theAnswer();
	}
}