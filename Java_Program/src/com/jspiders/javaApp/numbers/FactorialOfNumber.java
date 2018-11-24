package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) 
	{
		Scanner scanner=new  Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorila of "+num+" is "+fact);
		scanner.close();
	}

}
