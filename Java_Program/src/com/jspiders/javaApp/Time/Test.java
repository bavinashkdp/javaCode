package com.jspiders.javaApp.Time;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) 
	{
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime.getHour());
	}

}
