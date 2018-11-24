package com.jspiders.javaApp.Abtract;

public abstract  class Car 
{
	public abstract void drive();
}
class Audi extends Car
{

	@Override
	public void drive() 
	{
		System.out.println("audi is driving!!!");
	}
	
}
class Benz extends Car
{

	@Override
	public void drive() 
	{
		System.out.println("Benz is driving!!!");
	}
	
}
