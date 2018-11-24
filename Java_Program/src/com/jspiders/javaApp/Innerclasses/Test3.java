package com.jspiders.javaApp.Innerclasses;

public class Test3 
{
	public static void main(String[] args) 
	{
		E e=new E();
		e.display();
		//anonamous class
		E e2=new E(){
			public void display()
			{
				System.out.println("good Evening!!!!!!!!!!!!!!!!!");
			}
		};
		e2.display();

	}

}
