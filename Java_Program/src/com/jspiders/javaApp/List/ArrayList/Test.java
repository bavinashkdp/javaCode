package com.jspiders.javaApp.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) 
	{
		ArrayList<String>strings=new ArrayList<>();
		strings.add("abc");
		strings.add("jspiders");
		strings.addAll(strings);
		strings.add(null);
		for(int i=0;i<strings.size();i++)
		{
			System.out.println(strings.get(i));
		}
		System.out.println("*************");
		System.out.println(strings.size());
		
		strings.remove(1);
		System.out.println(strings.size());
		System.out.println("*************");
		for(int i=0;i<strings.size();i++)
		{
			System.out.println(strings.get(i));
		}

	}

}
