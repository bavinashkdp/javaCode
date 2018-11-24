package com.jspiders.javaApp.arrays;

public class RemoveDuplicateElementsFromArrray1 
{
	public static void main(String[] args) 
	{
		int[]arr={10,10,20,20,30,30};
		int length=arr.length;
		System.out.println(length);
		length=removeSpaces(arr, length);
		System.out.println(length);
		for(int i=0;i<=length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int removeSpaces(int[]arr,int n)
	{
		if(n==0|n==1)
		{
			return n;
		}
		int[]temp=new int[n];
		int j=0;
		for(int i=0;i<=n-2;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		return j;
		
		
	}

}
