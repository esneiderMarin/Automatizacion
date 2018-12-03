package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import userinterfaces.RoyalFilmsHomePage;



public class SearchForMovie implements Task {
	
	private PageObject page;

	public static SearchForMovie on(PageObject page) {
		return instrumented(SearchForMovie.class, page);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		
	}
	

	

	}
