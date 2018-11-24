package com.jspiders.javaApp.numbers;

public class SwapNUmbers {

	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping");
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
