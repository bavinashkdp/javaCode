package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class StrongNumberOrNot {

	public static void main(String[] args) 
	{
		Scanner  scanner=new Scanner(System.in);
		System.out.println("enter number");
		int number=scanner.nextInt();
		int temp=number;
		int sum=0;
		while(number>0)
		{
			int n1=number%10;
			number=number/10;
			sum=sum+fact(n1);
		}
		if(temp==sum)
		{
			System.out.println(temp+" strong number");
		}
		else
		{
			System.out.println(temp+" not a strong number");
		}
		scanner.close();
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
