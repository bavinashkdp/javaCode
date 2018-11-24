package com.jspiders.javaApp.List.LinkedList;

import java.util.Scanner;

public class MyLinkedList 
{
	public static void print(Node head)
	{
		while(head.next!=null)
		{
			System.out.print(head.ele+" ");
			head=head.next;
		}
	}
	public static Node takeInput()
	{
		Node head=null;
		Scanner scanner=new Scanner(System.in);
		System.out.println("how many elements");
		int size=scanner.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("enter  element");
			if(head==null)
			{
				head=new Node(scanner.nextInt());
			}
			else
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp=new Node(scanner.nextInt());
			}
		}
		scanner.close();
		return head;
	}
	public static void main(String[]args)
	{
		Node node1=new  Node(10);
		node1.next=new  Node(20);
		node1.next.next=new  Node(30);
		node1.next.next.next=new  Node(40);
		print(node1);
		Node node=takeInput();
		print(node);
		
		
	}


}
