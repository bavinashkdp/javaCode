package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class SumOfOneToNNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter starting numer");
		int start=scanner.nextInt();
		System.out.println("enter ending numer");
		int end=scanner.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
		sum=sum+i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
