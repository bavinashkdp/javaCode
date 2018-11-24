package com.jspiders.javaApp.Innerclasses;

public class Test1 {

	public static void main(String[] args)
	{
		A a=new A();
		a.i=10;
		System.out.println(a.i);
		
		//create an object for inner class
		A a2=new A();
		a2.i=20;
		A.B b=a2.new B();
		b.show();
		

	}

}
