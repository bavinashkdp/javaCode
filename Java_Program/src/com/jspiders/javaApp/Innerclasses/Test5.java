package com.jspiders.javaApp.Innerclasses;

public class Test5 {

	public static void main(String[] args) 
	{
		H h=new I();
		h.show();
		// anonamous class
		H h2=new H() {
			
			@Override
			public void show() {
				System.out.println("hellow");
			}
			
		};
		h2.show();
		// lambda expressions
		
		H h3= () ->{
			System.out.println("good morning!!!!!!");
		};
		 h3.show();
	}

}
