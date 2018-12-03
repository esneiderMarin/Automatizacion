package com.viajesexito.certification.purchase.interactions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class ManagmentRobot implements Interaction {

	private String comands;

	public ManagmentRobot(String comands) {
		this.comands = comands;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		Robot robot;
		switch (comands) {
		case "Enter":			
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(1000);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
			break;
		case "Escape":
			try {
				robot = new Robot();
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				robot.delay(1000);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;		

		default:
			break;
		}
	}

	public static Performable on(String comands) {
		return Instrumented.instanceOf(ManagmentRobot.class).withProperties(comands);
	}
}
