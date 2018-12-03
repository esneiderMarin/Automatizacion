package com.viajesexito.certification.purchase.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainTestUtil {

	public static void main(String[] args) {
		System.out.println(IgnoreTilde.convertTilde("Medellín"));
		System.out.println(NameDate.getNameDate("06"));
//		System.out.println(StringToInt.ConvertNumberStringToInt(SeparateDate.getMonth("01-05-2018")))));
		System.out.println(StringToInt.ConvertNumberStringToInt(SeparateDate.getMonth("01-04-2018"))-1);
	
		
	}
	

}
