package com.jspiders.javaApp.numbers;

public class SwapNUmbers1 {

	public static void main(String[] args) 
	{
		int i=10;
		int j=20;
		int k=i+j;
		System.out.println("i="+i);
		System.out.println("j="+j);
		
		i=k-i;
		j=k-i;
		System.out.println("after swaping");
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

}
