package com.jspiders.javaApp.Innerclasses;

public class Test4 {

	public static void main(String[] args) 
	{
		F f=new G();
		f.show();
		
		//anonamous class
		F f2=new F() {
			
			@Override
			public void show() 
			{
				System.out.println("products are selcted!!!");
				
			}
		};

		f2.show();
		/*F  f3=()->System.out.println("hellow world");
		f3.show();*/
	}

}
