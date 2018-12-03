package co.com.google.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.google.userinterfaces.GoogleAppsComponent;
import co.com.google.userinterfaces.GoogleHomePage;;
public class GoTo implements Task {

		private Target googleApp;
		
		public GoTo(Target googleApp) {
			this.googleApp = googleApp;
		}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GoogleHomePage.GOOGLE_NOT_NOW_MANAGE_PRIVACITY),
				Click.on(GoogleHomePage.GOOGLE_SEARCH_TEXTAREA),
				Click.on(googleApp));
	}

	public static GoTo theApp(Target googleApp) {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class, googleApp);
	}

}