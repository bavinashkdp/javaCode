package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrimePallindrome {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int number=scanner.nextInt();
		boolean isPrime=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime==true)
		{
			int temp=number;
			int reverse=0;
			while(number>0)
			{
				reverse=reverse*10+number%10;
				number=number/10;
			}
			if(temp==reverse)
			{
			System.out.println(temp+" is prime pallindrome!!!!");	
			}
			else
			{
				System.out.println(temp+" it is prime but not a pallindrome!!!!");	
				
			}
		}
	
		
		scanner.close();
	}

}
