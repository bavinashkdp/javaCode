package com.jspiders.javaApp.passwordGenerator;

public class Test 
{
	public static void main(String[] args) 
	{
	/*	String str="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			System.out.println(c+"="+(int)(c-96));
		}*/
		findWait("abccddde");
	}
	public static void findWait(String str)
	{
	/*	int sum=0;
		char[]arr=str.toCharArray();
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+(int)(arr[i]-96);
		}
		return sum;*/
		String s2="";
		char[]arr=str.toCharArray();
		for (int i = 0; i < arr.length-1; i++) 
		{
			if(arr[i+0]==arr[i+1])
			{
				s2=s2+arr[i];
				
			}
		}
		System.out.println(s2);
	}

}
