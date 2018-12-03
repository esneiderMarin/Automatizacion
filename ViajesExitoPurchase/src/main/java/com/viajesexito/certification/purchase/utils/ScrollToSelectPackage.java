package com.viajesexito.certification.purchase.utils;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.viajesexito.certification.purchase.userinterface.ViajesExitoSelectAPackage;

import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

public class ScrollToSelectPackage {
	
	public WebElement packageToBuy;
	public String packagesXpath = ViajesExitoSelectAPackage.BTN_SELECT_FLIGHT.getCssOrXPathSelector();
	public ScrollToSelectPackage(WebDriver driver) {
		int packageSelected;
		List<WebElement> packages = driver.findElements(By.xpath(packagesXpath));
	}
}
