package com.jspiders.javaApp.reverseVowels;

import java.util.Scanner;

public class ReplaceCharacters {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter sentence");
		String str=scanner.nextLine();
		char[]arr=str.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i]==' ') 
			{
				char temp=arr[i-1];
				arr[i-1]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		String str2=new String(arr);
		System.out.println(str2);
		scanner.close();
	}

}
