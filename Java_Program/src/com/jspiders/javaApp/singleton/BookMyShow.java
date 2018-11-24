package com.jspiders.javaApp.singleton;

import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.xml.validation.Validator;

public class BookMyShow
{
	private static BookMyShow bookMyShow;
	private BookMyShow() 
	{
	}
	public static BookMyShow getInstance()
	{
		if(bookMyShow!=null)
		{
			return bookMyShow=new BookMyShow();
		}
		else
		{
			return bookMyShow;
		}
	}
	public static void main(String[]args)
	{
		ResourceBundle bundle=ResourceBundle.getBundle("hibernate");
		Enumeration<String> enumeration=bundle.getKeys();
		while(enumeration.hasMoreElements())
		{
			String key=enumeration.nextElement();
			System.out.println(key+"="+bundle.getString(key));
		}
		Calendar calendar=Calendar.getInstance();
		Calendar calendar2=Calendar.getInstance();
		System.out.println(calendar.getTime());
		System.out.println(calendar==calendar2);
		BookMyShow bookMyShow=BookMyShow.getInstance();
		BookMyShow bookMyShow2=BookMyShow.getInstance();
		System.out.println(bookMyShow==bookMyShow2);
	}

}
