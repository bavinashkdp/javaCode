package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrintOneToNOddNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter start number");
		int start=scanner.nextInt();
		System.out.println("enter end number");
		int end=scanner.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
			System.out.print(i+" ");
			}
		}
		scanner.close();
		
	}

}
