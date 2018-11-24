package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter  start number");
		int start=scanner.nextInt();
		System.out.println("enter  start number");
		int end=scanner.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("sum="+sum);
		scanner.close();
	}

}
