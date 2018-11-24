package com.jspiders.javaApp;

public class Demo 
{

	public static void main(String[] args) 
	{
		int[]arr={2,8,5,7,3,9,6};
		int sum1=0,sum2=0;
		for (int i = 0; i <=1; i++) 
		{
			int index=i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[index]>arr[j])
				{
					index=j;//finding lowest element
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			sum1=sum1+temp;
			System.out.println("element="+arr[index]);
			System.out.println("sum1="+sum1);
		}
		for (int i = 0; i <=1; i++) 
		{
			int index=i;
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[index]<arr[j])
				{
					index=j;//finding highest element
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
			System.out.println("element="+arr[index]);
			sum2=sum2+temp;
			System.out.println("sum2="+sum2);
		}
		
		System.out.println("sum2="+sum2);
		System.out.println("sum1="+sum1);
		int diff=sum2-sum1;
		System.out.println("result is="+diff);

	}

}
