package com.jspiders.javaApp.conversion;

import java.util.Scanner;

public class DecimalToBinaryConversion {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int n=scanner.nextInt();
		String binary="";
		while(n>0)
		{
			binary=binary+n%2;
			n=n/2;
		}
		System.out.println(binary);
		scanner.close();
	}

}
