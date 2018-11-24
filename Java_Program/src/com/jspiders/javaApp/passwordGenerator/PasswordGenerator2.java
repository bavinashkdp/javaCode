package com.jspiders.javaApp.passwordGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class PasswordGenerator2 {

	public static void main(String[] args) 
	{
		System.out.println("your password is ="+generate(4));
	}
	public static String generate(int n)
	{
		String lowerCase="";
		for(int i=97;i<=122;i++)
		{
			lowerCase=lowerCase+(char)i;
		}
		String upperCase="";
		for(int i=65;i<=90;i++)
		{
			upperCase=upperCase+(char)i;
		}
		String numbers="";
		for(int i=48;i<=57;i++)
		{
			numbers=numbers+(char)i;
		}

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
		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(numbers);
		System.out.println(specialCase);
		char[]lowerChars=lowerCase.toCharArray();
		char[]upperChars=upperCase.toCharArray();
		char[]specialChars=specialCase.toCharArray();
		char[]numberChars=numbers.toCharArray();
		//logic 
		Random random=new Random();
		HashSet<Character>characters=new HashSet<Character>();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<1;j++)
			{
				if(i==0)
				{
					characters.add(lowerChars[random.nextInt(26)]);
				}
				if (i==1) 
				{
					characters.add(upperChars[random.nextInt(26)]);
				}
				if(i==2)
				{
					characters.add(specialChars[random.nextInt(32)]);
				}
				if(i==3)
				{
					characters.add(numberChars[random.nextInt(10)]);
				}
				
			}
			
			if(characters.size()==n)
			{
				break;
			}
			if (i+1==4)
			{
				i=0;
			}
		}
		List<Character>characters2=new ArrayList<Character>();
		characters2.addAll(characters);
		Collections.shuffle(characters2);
		StringBuffer buffer=new StringBuffer();
		for(int i=0;i<characters2.size();i++)
		{
			buffer.append(characters2.get(i));
		}
		return buffer.toString();
		
	}

}
