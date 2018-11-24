package com.jspiders.javaApp.lift;

public class Person
{
	private String name;
	public static int count;
	public Person() {
		count++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	

}
