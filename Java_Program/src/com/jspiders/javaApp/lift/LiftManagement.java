package com.jspiders.javaApp.lift;

import java.time.DayOfWeek;
import java.util.Date;
import java.util.Scanner;

public class LiftManagement 
{
	
	public static void main(String[] args) 
	{
		Scanner scanner=new  Scanner(System.in);
		System.out.println("click floor number");
		int number=scanner.nextInt();
		Date date=new Date();
		int time=date.getHours();
		Person person=new Person();
		Person person2=new Person();
		person.setName("avid");
		person2.setName("hari");
		System.out.println("you want to goup or godown");
		String str=scanner.next();
		if(str.equalsIgnoreCase("goup"))
		{	
			if(number>=1&number<=5)
			{
				if(time>=6&time<=11)
				{
					if(person.count<=10&person.count>=1)
					{
						goUp(number,person.count);
					}
				System.out.println(time);
				}
			}
		}
		if(str.equalsIgnoreCase("godown"))
		{	
			if(number>=0&number<=4)
			{
				if(time>=6&time<=11)
				{
					if(person.count<=10&person.count>=1)
					{
						goDown(number,person.count);
					}
				System.out.println(time);
				}
			}
		}
		scanner.close();
	}
	public static void goUp(int floornumber,int noOfPersons)
	{
		System.out.println(noOfPersons+" persons reached to  "+floornumber+" floor");
		
	}
	public static void goDown(int floornumber,int noOfPersons)
	{
		System.out.println(noOfPersons+" reached to  "+floornumber+" floor");
	}

}
