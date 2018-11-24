package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class Tables1 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number 1");
		int n1=scanner.nextInt();

		System.out.println("enter number 2");
		int n2=scanner.nextInt();
		for(int i=1;i<=n1;i++)
		{
			for(int j=1;j<=n2;j++)
			{
				System.out.print(j+"*"+i+"="+j*i+"\t\t");
			}
			System.out.println();
		}

	}

}
