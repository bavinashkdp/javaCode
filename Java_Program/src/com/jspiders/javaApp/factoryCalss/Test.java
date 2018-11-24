package com.jspiders.javaApp.factoryCalss;

public class Test {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		Car car=CarFactory.getCar("Benz");
		car.drive();
	}

}
