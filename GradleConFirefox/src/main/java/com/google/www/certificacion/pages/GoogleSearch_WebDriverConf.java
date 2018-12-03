package com.google.www.certificacion.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GoogleSearch_WebDriverConf {

	static WebDriver Daniel; // Declaro estatica. Es un atributo de la clase

	public GoogleSearch_WebDriverConf() {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		Daniel = new FirefoxDriver();// Este es mi webdriver
	}

	public void openURL(String url) {

		Daniel.get(url); // Obtengo URL y voy a ella

	}
	
	public static void openStaticURL(String url) {

		Daniel.get(url); // Obtengo URL y voy a ella

	}

	public void closeBrowser() {

		Daniel.close(); // Cierro el navegador

	}
	
	public static void closeAllBrowsers() {

		Daniel.quit(); // Cierro el navegador

	}

	public void searchWord(String id, String word) {

		Daniel.findElement(By.id(id)).sendKeys(word+Keys.ENTER); // Busco el elemento y presiono Enter
		
	}
	
	public static void searchStaticWord(String id, String word) {

		Daniel.findElement(By.id(id)).sendKeys(word+Keys.ENTER); // Busco el elemento y presiono Enter
		
	}
	
	public static void openTab() {

		((JavascriptExecutor)Daniel).executeScript("window.open()"); // Abro otra pestaña
		ArrayList<String> tabs = new ArrayList<String>(Daniel.getWindowHandles()); //Handles: atributos de ventana
		//Me dice la cantidad de ventanas que hay y las organiza en un vector dinamico
		//La ventana que abra primero es la 0. {Confirmar si la 0 es default}
		Daniel.switchTo().window(tabs.get(1)); //voy al tab 1

	}

	public void findElementByPath(String xpath) {

		Daniel.findElement(By.id(xpath)).click(); // Busco el elemento y clickeo

	}


}
