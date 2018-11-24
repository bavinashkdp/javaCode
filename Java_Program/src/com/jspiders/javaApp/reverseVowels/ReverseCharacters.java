package com.jspiders.javaApp.reverseVowels;

public class ReverseCharacters {

	public static void main(String[] args) 
	{
		String str="aabbccddee";
		char[]arr=str.toCharArray();
		
		/*
		 * [a]<--arr[0]
		 * [a]
		 * [b]
		 * [b]
		 * [c]
		 * [c]
		 * [d]
		 * [d]
		 * [e]
		 * [e]<--arr[arr.length-1]
		 * */
		String str2="";
		for(int i=arr.length-1;i>=0;i--)
		{
			str2=str2+arr[i];
		}
		System.out.println(str2);
		if(str2.contains("e"))
		{
			str2=str2.replace("e", "a");
		}
		System.out.println(str2);

	}

}
