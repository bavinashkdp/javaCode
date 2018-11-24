package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
		}
		System.out.println("reverse number is "+reverse);
		scanner.close();

	}

}
