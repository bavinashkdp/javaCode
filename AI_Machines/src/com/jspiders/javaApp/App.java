package com.jspiders.javaApp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {

	public static void main(String[] args) 
	{
		String str="";
		for(int i=33;i<=122;i++)
		{
			System.out.println(i+"="+(char)i);
			str= str+(char)i;
		}
		for(int i=123;i<=126;i++)
		{
			System.out.println(i+"="+(char)i);
			str= str+(char)i;
		}
		for(int i=58;i<=64;i++)
		{
			System.out.println(i+"="+(char)i);
			str= str+(char)i;
		}
		for(int i=91;i<=97;i++)
		{
			System.out.println(i+"="+(char)i);
			str= str+(char)i;
		}
		System.out.println(str);
		System.out.println((int)'@');
		Map<String, String>map=new HashMap<>();
		map.put("key1", "10");
		map.put("key1", "20");
		map.put("key1", "30");
		map.put("key1", "40");
		map.put("key1", "50");
		Set<Entry<String, String>> set=map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey()+"="+entry.getValue());
			
		}
		

	}

}
