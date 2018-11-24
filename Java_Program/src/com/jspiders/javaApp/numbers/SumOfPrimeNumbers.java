package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter min number");
		int min=scanner.nextInt();
		System.out.println("enter max number");
		int max=scanner.nextInt();
		int sum=0;
		for(int i=min;i<=max;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		System.out.println("sum of prime numbers="+sum);
	}

}
