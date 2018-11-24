package com.jspiders.javaApp.Constructor;

public class A
{
	public A()
	{
	System.out.println("object created!!!!!!!");	
	}
	public A(int a)
	{
	System.out.println(a+"object created!!!!!!!");	
	}
	public A(String b)
	{
	System.out.println(b+"object created!!!!!!!");	
	}
	
	public static void main(String[] args) 
	{
		new A();
		new A();
		new A();
		new A();
		new A();
		new A();
		
		new A(10);
		new A("swetha");
		
	}

}
