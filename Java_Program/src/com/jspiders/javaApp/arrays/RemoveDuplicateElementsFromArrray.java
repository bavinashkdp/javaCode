package com.jspiders.javaApp.arrays;

public class RemoveDuplicateElementsFromArrray {

	public static void main(String[] args) 
	{
		int[]arr={10,20,20,30,30,30,40,40,40,40,50,50,50,50,50};
		//int[]arr={10,20};
		System.out.println(arr.length);
		int length=arr.length;
		System.out.println(length);
		length=remove(arr, length);
		System.out.println(length);
		for(int i=0;i<=length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int remove(int[]arr,int n)
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
