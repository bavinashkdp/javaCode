package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class FindGCDNUmber {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num1");
		int num1=scanner.nextInt();
		System.out.println("enter num2");
		int num2=scanner.nextInt();
		int a=findGCD(num1, num2);
		System.out.println("gcd number is "+a);
		scanner.close();
	}
	public static int findGCD(int m,int n)
	{
		if(m<n)
		{
			return findGCD(n, m);
		}
		if(n==0)
		{
			return m;
		}
		return findGCD(n, m%n);
	}

}
