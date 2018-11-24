package com.jspiders.javaApp.Innerclasses;

@FunctionalInterface
public interface H 
{
	public void show();
	//public void display(); 
	//if we declare more than one method it throw error because it is functional interface

}
class I implements H
{

	@Override
	public void show() 
	{
		System.out.println("hai");
		
	}
	
}

