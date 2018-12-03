package com.viajesexito.certification.purchase.interactions;

import java.util.List;

import com.viajesexito.certification.purchase.userinterface.ViajesExitosHomePrincipalPage;
import com.viajesexito.certification.purchase.utils.NameDate;
import com.viajesexito.certification.purchase.utils.SeparateDate;
import com.viajesexito.certification.purchase.utils.StringToInt;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectDate implements Interaction {

	private Target target;
	private String date;

	public SelectDate(Target target, String date) {
		super();
		this.target = target;
		this.date = date;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(target));
		List<WebElementFacade> months = ViajesExitosHomePrincipalPage.MONTH_PICKER.resolveAllFor(actor);
		List<WebElementFacade> years = ViajesExitosHomePrincipalPage.YEAR_PICKER.resolveAllFor(actor);

		if (months.get(0).containsText(NameDate.getNameDate(SeparateDate.getMonth(date)))
				&& years.get(0).containsText(SeparateDate.getYear(date))) {
			actor.attemptsTo(Click.on(ViajesExitosHomePrincipalPage.SELECT_DEPARTURE_DATE_OK
					.of(SeparateDate.getDay(date).replace("0", ""))));
		} else {
			int interactions = Integer.parseInt(SeparateDate.getMonth(date));
			for (int i = 0; i < interactions; i++) {
				actor.attemptsTo(Click.on(ViajesExitosHomePrincipalPage.BTN_NEXT_MONTH));
			}
			actor.attemptsTo(Click.on(ViajesExitosHomePrincipalPage.SELECT_DEPARTURE_DATE_OK
					.of(String.valueOf(StringToInt.ConvertNumberStringToInt(SeparateDate.getDay(date)))))
				);

		}
		

	}

	public static Performable on(Target target, String date) {
		return Instrumented.instanceOf(SelectDate.class).withProperties(target, date);
	}
}
