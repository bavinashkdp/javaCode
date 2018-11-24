package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number ???????");
		int number=scanner.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(number+" * "+i+" = "+number*i);
		}
		scanner.close();
	}

}
