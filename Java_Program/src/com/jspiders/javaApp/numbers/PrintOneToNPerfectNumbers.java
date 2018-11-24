package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrintOneToNPerfectNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter start number ");
		int start=scanner.nextInt();
		System.out.println("enter end number ");
		int end=scanner.nextInt();
		for(int i=start;i<=end;i++)
		{
			
			int temp=i;
			int sum=0;
			for(int j=1;j<=i-1;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==temp)
			{
				System.out.print(temp+" ");
			}
		}
		scanner.close();

	}

}
