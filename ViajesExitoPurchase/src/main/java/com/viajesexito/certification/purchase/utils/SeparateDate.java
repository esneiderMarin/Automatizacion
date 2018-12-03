package com.viajesexito.certification.purchase.utils;

public class SeparateDate {

	public static String getDay(String date)
	{
		String day = date.charAt(0) + "" + date.charAt(1);
		return day;
	}
	
	public static String getMonth(String date)
	{
		String month = date.charAt(3) + "" + date.charAt(4);
		return month;
	}
	
	public static String getYear(String date)
	{
		String year = date.charAt(6) + "" + date.charAt(7) + "" + date.charAt(8) + "" + date.charAt(9);
		return year;
	}
}
