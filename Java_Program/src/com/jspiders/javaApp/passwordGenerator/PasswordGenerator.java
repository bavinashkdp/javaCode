package com.jspiders.javaApp.passwordGenerator;
import java.util.*;
public class PasswordGenerator 
{
	public static void main(String[]args) 
	{
		generate(12);
	}
	public static void generate(int n)
	{
		 String specialStr="";
		 for(int i=33;i<=47;i++)
		 {
			 specialStr=specialStr+(char)i;
		 }
		 System.out.println(specialStr);
		 for(int i=58;i<=64;i++)
		 {
			 specialStr=specialStr+(char)i;
		 }
		 System.out.println(specialStr);
		 for(int i=91;i<=96;i++)
		 {
			 specialStr=specialStr+(char)i;
		 }
		 System.out.println(specialStr);
		 for(int i=123;i<=126;i++)
		 {
			 specialStr=specialStr+(char)i;
		 }
		 System.out.println(specialStr);
		 String numberStr="";
		 System.out.println(numberStr);
		 
		 for(int i=48;i<=57;i++)
		 {
			 numberStr=numberStr+(char)i;
		 }
		 System.out.println(numberStr);
		 String uppperCharStr="";
		 for(int i=65;i<=90;i++)
		 {
			 uppperCharStr=uppperCharStr+(char)i;
		 }
		 System.out.println(uppperCharStr);
		 String lowerCharStr="";
		 for(int i=97;i<=122;i++)
		 {
			 lowerCharStr=lowerCharStr+(char)i;
		 }
		 System.out.println(lowerCharStr);
		 char[]specialChars=specialStr.toCharArray();
		 char[]upperChars=uppperCharStr.toCharArray();
		 char[]lowerChars=lowerCharStr.toCharArray();
		 char[]numberChars=numberStr.toCharArray();
	     Random  random=new  Random();
	Set<Character> password=new HashSet<Character>();

	for(int i=0;i<4;i++)
	{
		for(int j=0;j<1;j++)
		{
		if(i==0)
		{
		password.add(specialChars[random.nextInt(32)]);
		}
		else if(i==1)
		{
			password.add(upperChars[random.nextInt(26)]);
		}
		else if(i==2)
		{
			password.add(lowerChars[random.nextInt(26)]);
		}
		else if(i==3)
		{
			password.add(numberChars[random.nextInt(10)]);
		}
		}
		if(password.size()==n)
		{
			break;
		}
		if(i+1==4)
		{
			i=0;
			
		}
		
	}
	List<Character> characters=new  ArrayList<Character>();
	characters.addAll(password);
	Collections.shuffle(characters);
	StringBuffer buffer=new StringBuffer();
		for(int i=0;i<characters.size();i++)
		{
			buffer.append(characters.get(i));
		}
		System.out.println("password is=\t"+buffer);
	}

}
