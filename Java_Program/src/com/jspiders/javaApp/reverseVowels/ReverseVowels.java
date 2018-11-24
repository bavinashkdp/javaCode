package com.jspiders.javaApp.reverseVowels;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseVowels
{
	public static void main(String[]args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter String ");
		String str="10i mouaika";
		reverse(str);
	}
	public static void reverse(String str)
	{
		ArrayList<Character>characters=new ArrayList<>();
		characters.add('a');
		characters.add('e');
		characters.add('i');
		characters.add('o');
		characters.add('u');
		int i=0;
		int j=str.length()-1;
		char[]arr=str.toCharArray();
		
		while(i<j)
		{
			if(!characters.contains(arr[i]))
			{
				i++;
				continue;
			}
			if(!characters.contains(arr[j]))
			{
				j--;
				continue;
			}
			char c=arr[i];
			arr[i]=arr[j];
			arr[j]=c;
			
			i++;
			j--;
		}
		String str1=new  String(arr);
		System.out.println(str1);
		
	}
		
		
				
}
