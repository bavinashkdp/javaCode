package com.jspiders.javaApp.factoryCalss;

public class CarFactory
{
	public static Car getCar(String carName) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Car car=(Car)Class.forName("com.jspiders.javaApp.factoryCalss."+carName).newInstance();
		return car;
	}

}
