package com.google.certificacion.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.www.certificacion.pages.GoogleSearch_WebDriverConf;

public class GoogleSearchLogin {

	String url = "http://www.google.com"; //Especifico URL
	String word = "Segunda search"; // Palabra a buscar
	String id="lst-ib"; // id de caja de texto
	
	GoogleSearch_WebDriverConf ins= new GoogleSearch_WebDriverConf(); // Instancio clase con métodos
	
	@Before
	public void setUp() throws Exception {
		ins.openURL(url); // Abro URL
	}

	@After
	public void tearDown() throws Exception {
		// ins.closeBrowser(); // Cierro browser
	}

	@Test
	public void test() {
		ins.searchWord(id,word); // Busco palabra
		//fail("Not yet implemented");
	}

}
