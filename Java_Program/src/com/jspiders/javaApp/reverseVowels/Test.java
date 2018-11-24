package com.jspiders.javaApp.reverseVowels;

public class Test 
{
	public static void main(String[]args)
	{
		System.out.println("main starts");
		int i=0;
		while(i<=10)
		{
			System.out.println("while starts");
			if(i==5)
			{
				i++;
				continue;//continue statement is used to continue the 
				//current flow of program
				//it will skip the current iteraton 
				//it will  jum into next iteration
			}
			System.out.println(i);
			i++;
			System.out.println("while ends");
		}
		for(i=0;i<=10;i++)
		{			
			System.out.println("i="+i);
		}
		System.out.println("main end");
	}

}
