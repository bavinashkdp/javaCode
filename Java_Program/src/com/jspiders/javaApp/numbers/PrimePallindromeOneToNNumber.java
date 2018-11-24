package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrimePallindromeOneToNNumber 
{
	public static boolean isPrime(int n)
	{
		boolean b=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
		if(b==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isPallindrome(int n)
	{
		int temp=n;
		int reverse=0;
		while(n>0)
		{
			reverse=reverse*10+n%10;
			n=n/10;
		}
		if(reverse==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter min range");
		int min=scanner.nextInt();

		System.out.println("enter max range");
		int max=scanner.nextInt();
		for(int i=min;i<=max;i++)
		{
			boolean b=isPrime(i);
			if(b==true)
			{
				boolean b1=isPallindrome(i);
				if(b1==true)
				{
					System.out.println("prime pallindrome------>"+i);
				}
			}
		}
		scanner.close();
	}

}
