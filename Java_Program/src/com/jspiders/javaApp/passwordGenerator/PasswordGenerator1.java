package com.jspiders.javaApp.passwordGenerator;

public class PasswordGenerator1
{
	public static void main(String[] args) 
	{
		generate(10);
	}
	public static void generate(int n)
	{
		String lowerCase="";
		String upperCase="";
		String numbers="";
		for(int i=97;i<=122;i++)
		{
			lowerCase=lowerCase+(char)i;
		}
		System.out.println(lowerCase);
		
		for(int i=65;i<=90;i++)
		{
			upperCase=upperCase+(char)i;
		}
		System.out.println(upperCase);
		
		String specialCase="";
		for(int i=33;i<=47;i++)
		{
			specialCase=specialCase+(char)i;
		}
		for(int i=58;i<=64;i++)
		{
			specialCase=specialCase+(char)i;
		}
		for(int i=91;i<=96;i++)
		{
			specialCase=specialCase+(char)i;
		}
		for(int i=123;i<=126;i++)
		{
			specialCase=specialCase+(char)i;
		}
		System.out.println(specialCase);
		
		for(int i=48;i<=57;i++)
		{
			numbers=numbers+(char)i;
		}
		System.out.println(numbers);
		char[]lowerChars=lowerCase.toCharArray();
		char[]upperChars=upperCase.toCharArray();
		char[]specialChars=specialCase.toCharArray();
		
		
	}

}
