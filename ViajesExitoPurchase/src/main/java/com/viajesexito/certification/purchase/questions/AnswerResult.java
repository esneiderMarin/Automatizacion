package com.viajesexito.certification.purchase.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class AnswerResult implements Question<String>{

	protected Target target;
	
	public AnswerResult(Target target) {
		this.target = target;
	}

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(target).viewedBy(actor).asString();
	}

	public static AnswerResult es(Target target)
	{
		return new AnswerResult(target);
	}
}
