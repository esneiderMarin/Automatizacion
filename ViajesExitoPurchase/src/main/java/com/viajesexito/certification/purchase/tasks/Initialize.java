package com.viajesexito.certification.purchase.tasks;

import java.util.List;

import com.viajesexito.certification.purchase.model.ViajesExitoModel;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class Initialize implements Task{

	private List<List<String>> data;
	public static List<ViajesExitoModel> viajesModelData;
	
	public Initialize(List<List<String>> data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		ViajesExitoModel model = new ViajesExitoModel();
		model.setOriginCity(data.get(1).get(0));
		model.setDestinationCity(data.get(1).get(1));
		model.setDateOrigin(data.get(1).get(2));
		model.setDateBack(data.get(1).get(3));
		viajesModelData.add(model);
	}

	public static Initialize on(List<List<String>> data)
	{
		return Instrumented.instanceOf(Initialize.class).withProperties(data);
	}
}
