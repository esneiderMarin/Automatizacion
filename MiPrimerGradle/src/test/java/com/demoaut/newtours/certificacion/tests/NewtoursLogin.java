package com.demoaut.newtours.certificacion.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursLogin {

	private WebDriver navegador;
	
	@Before
	public void setUp() throws Exception {
		// El controlador para chrome se encuentra en la dirección especificada
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		// Cuando creamos nuestro robot, automaticamente estamos abriendo una nueva ventana en el navegador
		navegador = new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {
		//Cerramos el navegador
		navegador.close();
	}

	@Test
	public void test() {
		navegador.get("https://www.google.com/");
		navegador.findElement(By.id("lst-ib")).sendKeys("Test"+Keys.RETURN);
		
	}

}
