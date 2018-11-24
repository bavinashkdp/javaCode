package com.jspiders.javaApp.Constructor;

public class Test 
{
	public  Test() 
	{
		System.out.println("we can declare return statement in default constructor ....!!!!!!");
		return;
	}

	public static void main(String[] args) 
	{
		new Test();
		//String str="abc";
		String str2=new String("xyz");
		String str3="xyz";
		System.out.println(str2==str3);
		String i="a";
		try{
		 i+="b";
		 throw new Exception();
		}catch (Exception e)
		{
			i+="c";
		}
		finally
		{
			i+="d";
		}
		i+="e";
		System.out.println(i);
		

	}

}
