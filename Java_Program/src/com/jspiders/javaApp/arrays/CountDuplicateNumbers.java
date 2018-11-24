package com.jspiders.javaApp.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountDuplicateNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer>integers=new ArrayList<>();
		integers.add(1);
		integers.add(5);
		integers.add(3);
		integers.add(2);
		integers.add(4);
		integers.add(6);
		integers.add(1);
		integers.add(3);
		integers.add(3);
		count(integers);
	}
	public static void count(List<Integer>numbers) 
	{
		int count=0;
		for(int i=0;i<numbers.size();i++)
		{
			int temp=numbers.get(i);
			int j=i;
			while(j<numbers.size()-2)
			{
				if (numbers.get(j)==numbers.get(j+1)) {
					count++;
					System.out.println("couunt"+count);
					
				}
				j++;
			}
		System.out.println(numbers.get(i));
		}
		
	}

}
