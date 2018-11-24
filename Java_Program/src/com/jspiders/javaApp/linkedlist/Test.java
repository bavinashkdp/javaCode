package com.jspiders.javaApp.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test 
{
	public static void main(String[]args)
	{
		MyLinkedList linkedList=new MyLinkedList();
		for(int i=1;i<=10;i++)
		{
			linkedList.add("name"+i);
		}
		for(int i=0;i<linkedList.size();i++)
		{
			System.out.println(linkedList.get(i));
		}
		System.out.println("****************");
		Node node=linkedList.reverse(linkedList.get1(0));
		Node temp=node;
		while(temp!=null)
		{
			System.out.println(temp.ele);
			temp=temp.next;
		}
			 
	
	}

}
