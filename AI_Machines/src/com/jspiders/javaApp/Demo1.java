package com.jspiders.javaApp;

import java.util.ArrayList;

public class Demo1 {

	public static void main(String[] args) 
	{
		String sre="java                is    oop";
		System.out.println(delSpaces(sre));

	}
	public static String delSpaces(String str){
	    StringBuilder sb = new StringBuilder(str);
	    ArrayList<Integer> spaceIndexes = new ArrayList<>();

	    for ( int i=0; i < sb.length(); i++ ){
	        if ( sb.charAt(i) == ' ' && sb.charAt(i-1) == ' '){
	            spaceIndexes.add(i);
	        }
	    }

	    for (int i = 0; i < spaceIndexes.size(); i++){
	        sb.deleteCharAt(spaceIndexes.get(i)-i);
	    }
	    return new String(sb.toString());
	}
}
