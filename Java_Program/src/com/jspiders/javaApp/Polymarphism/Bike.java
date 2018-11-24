package com.jspiders.javaApp.Polymarphism;

public class Bike 
{
	public void start()
	{
		System.out.println("bike started");
	}
	public void stop()
	{
		System.out.println("bike stopped");
	}
}
class Pulser extends Bike
{
	
	public void start()
	{
		System.out.println("pulser started");
	}
	public void stop()
	{
		System.out.println("pulser stopped");
	}

}
class Bajaj extends Bike
{
	public void start()
	{
		System.out.println("Bajaj started");
	}
	public void stop()
	{
		System.out.println("Bajaj stopped");
	}
}
class Driver
{
	
	public void drive(Bajaj bajaj)
	{
		if(bajaj!=null)
		{
			bajaj.start();
			bajaj.stop();
		}
	}
	public void drive(Bike bike)
	{
		if(bike!=null)
		{
			bike.start();
			bike.stop();
		}
	}
}