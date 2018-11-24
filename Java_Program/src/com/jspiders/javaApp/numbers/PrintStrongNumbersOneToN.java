package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrintStrongNumbersOneToN
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter min number");
		int min=scanner.nextInt();
		System.out.println("enter max number");
		int max=scanner.nextInt();
		for(int i=min;i<=max;i++)
		{
			int temp=i;
			int sum=0;
			while(temp>0)
			{
				int n1=temp%10;
				sum=sum+fact(n1);
				temp=temp/10;
			}
			if(sum==i)
			{
				System.out.println("strong number---->"+i);
			}
			
		}
		scanner.close();
	}
	public static int fact(int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

}
