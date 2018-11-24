package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PerfectNumberOrNot {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number");
		int num=scanner.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1;i<=num-1;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum=sum+i;
			}
		}
		System.out.println();
		if(sum==temp)
		{
			System.out.println(temp+" is perfect number");
		}
		else
		{
			System.out.println(temp+" is not a perfect number");
		}
		scanner.close();
	}

}
