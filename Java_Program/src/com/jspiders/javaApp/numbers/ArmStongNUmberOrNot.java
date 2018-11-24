package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class ArmStongNUmberOrNot {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int number=scanner.nextInt();
		isArmStrongNumber(number);
		scanner.close();
	}
	public static int countDigits(int n)
	{
		int count=0;
		int reverse=0;
		while(n>0)
		{
			reverse=reverse*10+n%10;
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
	public static void isArmStrongNumber(int x)
	{
		int temp=x;
		int cd=countDigits(x);
		int temp1=0;
		while(x>0)
		{
			int y=x%10;
			temp1=temp1+pow(y, cd);
			x=x/10;
		}
		if(temp==temp1)
		{
			System.out.println(temp+" is armstrong number");
		}
		else
		{
			System.out.println(temp+" is not a armstrong number");
		}
		
	}

}
