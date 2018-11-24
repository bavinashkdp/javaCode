package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class FactorialOfNumbersOneToN {

	public static void main(String[] args) 
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter min number");
	int min=scanner.nextInt();

	System.out.println("enter max number");
	int max=scanner.nextInt();
	for(int i=min;i<=max;i++)
	{
		int fact=1;
		for(int j=1;j<=i;j++)
		{
			fact=fact*j;
		}
		System.out.println(i+"factorial -------->"+fact);
	}
	
	scanner.close();
	}

}
