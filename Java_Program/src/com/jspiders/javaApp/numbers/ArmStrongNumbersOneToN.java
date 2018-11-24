package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class ArmStrongNumbersOneToN 
{
	public static int countDigits(int n)
	{
		int count =0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	public static int pow(int p,int q)
	{
		int pw=1;
		while(q>0)
		{
			pw=pw*p;
			q--;
		}
		return pw;
	}
	public static void isArmStrong(int n)
	{
		int temp=n;
		int cd=countDigits(n);
		int temp1=0;
		while(n>0)
		{
			int x=n%10;
			temp1=temp1+pow(x, cd);
			n=n/10;
		}
		if(temp==temp1)
		{
			System.out.println("arm strong number--->"+temp);
		}
	}

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter min number");;
		int min=scanner.nextInt();
		System.out.println("enter max number");;
		int max=scanner.nextInt();
		for(int i=min;i<=max;i++)
		{
			isArmStrong(i);
		}
		scanner.close();
	}

}
