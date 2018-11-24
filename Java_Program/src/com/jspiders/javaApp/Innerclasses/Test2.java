package com.jspiders.javaApp.Innerclasses;

public class Test2 {

	public static void main(String[] args) 
	{
		C.j=80;
		System.out.println(C.j);
		
		//create object for nested class
		C.D d=new C.D();
		d.k=50;
		d.display();
	
	}

}
