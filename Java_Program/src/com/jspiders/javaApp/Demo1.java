package com.jspiders.javaApp;

public class Demo1
{
	public static void main(String[]args) 
	{
		int[]arr={2,8,5,7,3,9,6};
		int biggerSum=findBiggerValue(arr);
		int smallerSum=findSmallValue(arr);
		int diff=biggerSum-smallerSum;
		System.out.println("diff="+diff);
	}
	public  static int findSmallValue(int[]arr)
	{
		int sum1=0;
		for (int i = 0; i <=1; i++) 
		{
			int index=i;
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[index]>arr[j])
			{
				index=j;//finding lowest value
			}
		}	
		int smallestValue=arr[index];
		arr[index]=arr[i];
		arr[i]=smallestValue;
		sum1=sum1+smallestValue;
		}
		return sum1;
	}
	public  static int findBiggerValue(int[]arr)
	{
		int sum1=0;
		for (int i = 0; i <=1; i++) 
		{
			int index=i;
		for (int j = i+1; j < arr.length; j++) 
		{
			if(arr[index]<arr[j])
			{
				index=j;//finding bigger value
			}
		}	
		int biggest=arr[index];
		arr[index]=arr[i];
		arr[i]=biggest;
		sum1=sum1+biggest;
		}
		return sum1;
	}

}
