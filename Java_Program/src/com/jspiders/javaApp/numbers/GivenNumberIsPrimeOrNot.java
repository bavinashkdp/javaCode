package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class GivenNumberIsPrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		if(num<2)
		{
			System.out.println("prime numbers starts from 2");
			scanner.close();
			return;
		}
		else
		{
		boolean isPrime=true;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			System.out.println(num+" is prime number ");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
		scanner.close();
		return;
		}
	}

}
