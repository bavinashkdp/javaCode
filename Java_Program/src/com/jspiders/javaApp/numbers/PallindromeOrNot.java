package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PallindromeOrNot {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		int temp=num;
		int reverse=0;
		while(num>0)
		{
			reverse=reverse*10+num%10;
			System.out.print(reverse+" ");
			num=num/10;
		}
		System.out.println();
		if(temp==reverse)
		{
			System.out.println(temp+" is pallindrome");
		}
		else
		{
			System.out.println(temp+" not a pallindrome");
		}
		scanner.close();

	}

}
