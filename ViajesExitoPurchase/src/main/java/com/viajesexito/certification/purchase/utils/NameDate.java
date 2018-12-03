package com.viajesexito.certification.purchase.utils;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class NameDate {

	public static String getNameDate(String month)
	{
		String mesString;
		switch (month) {
		        case "01":  mesString = "Enero";
		                 break;
		        case "02":  mesString  = "Febrero";
		                 break;
		        case "03":  mesString = "Marzo";
		                 break;
		        case "04":  mesString = "Abril";
		                 break;
		        case "05":  mesString = "Mayo";
		                 break;
		        case "06":  mesString = "Junio";
		                 break;
		        case "07":  mesString = "Julio";
		                 break;
		        case "08":  mesString = "Agosto";
		                 break;
		        case "09":  mesString = "Septiembre";
		                 break;
		        case "10": mesString = "Octubre";
		                 break;
		        case "11": mesString = "Noviembre";
		                 break;
		        case "12": mesString = "Diciembre";
		                 break;
		        default: mesString = "Invalid month";
		                 break;
		        }
		        
		return mesString;
	}
	
}
