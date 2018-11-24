package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrintOneToNNumbersReverse {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter starting number????? ");
		int start=scanner.nextInt();
		System.out.println("enter ending number????? ");
		int end=scanner.nextInt();
		for(int i=end;i>=start;i--)
		{
			System.out.print(i+" ");
		}
		
	}

}
