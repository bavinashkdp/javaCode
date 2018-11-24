package com.jspiders.javaApp.numbers;

import java.util.Scanner;

public class PrintOneToNPrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter min number");
		int min=scanner.nextInt();
		System.out.println("enter max number");
		int max=scanner.nextInt();
			if(min<2|max<2)
			{
					System.out.println("prime number starts from 2");
					scanner.close();
					return;
			}
			else
			{
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
					}
				}
				scanner.close();
				return;
			}
				
	}

}
