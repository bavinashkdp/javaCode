package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class FibnosciiSiries {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter range");
		int range=scanner.nextInt();
		int a=0;int b=1;
		System.out.print(a+" "+b);
		for(int i=2;i<=range;i++)
		{
			int c=a+b;
			if(c<=range)
			{
				System.out.print(" "+c);;
				a=b;
				b=c;
			}
			
		}
		scanner.close();
		

	}

}
