package com.google.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.google.pages.LoginPOM;

public class LoginTest {
	
	public static String user = "esneider.selenium@gmail.com"; 
	public static String password = "1234567890S_";
	public static String textToValidate = "Principal";

	@Before
	public void setUp() {	
		LoginPOM.initializeBrowserInUrl("https://www.google.com/intl/es/gmail/about/#");
	}



	@Test
	public void test() throws InterruptedException {
		LoginPOM.loginInGmail(user, password);
		
	}
	
	@After
	public void tearDown() throws Exception {
		LoginPOM.assertLogin(textToValidate);
	}

}
