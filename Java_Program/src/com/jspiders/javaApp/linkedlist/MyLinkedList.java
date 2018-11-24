package com.jspiders.javaApp.linkedlist;

public class MyLinkedList
{
	public Node first;
	public Node last;
	public int count;
	public Node reverse(Node head)
	{
		if(head.next==null)
		{
			return head;
		}
		Node currNode=head;
		Node temp=null;
		Node prev=null;
		while(currNode!=null)
		{
			temp=currNode.next;
			currNode.next=prev;
			prev=currNode;
			currNode=temp;
		}
		return prev;
	}
	public int size()
	{
		return count;
	}
	public void add(Object ele)
	{
		if(first==null)
		{
			first=new Node(ele);
			last=first;
			count++;
		}
		else
		{
			last.next=new Node(ele);
			last=last.next;
			count++;
		}
	}
	public Object get(int index)
	{
		if(first==null)
		{
		   	 throw new IndexOutOfBoundsException();
		}
		else
		{
			Node temp=first;
			for (int i = 0; i <=index-1; i++)
			{
				temp=temp.next;
			}
			return temp.ele;		
		}
		
	}
	public Node get1(int index)
	{
		if(first==null)
		{
		   	 throw new IndexOutOfBoundsException();
		}
		else
		{
			Node temp=first;
			for (int i = 0; i <=index-1; i++)
			{
				temp=temp.next;
			}
			return temp;		
		}
		
	}
	public void delete(int index)
	{
		if(first==null| index>=size())
		{
			 throw new IndexOutOfBoundsException();	
		}
		else
		{
			Node temp=first;
			for (int i = 0; i <=index-2; i++)
			{
				temp=temp.next;
			}
			temp.next=temp.next.next;
			count--;
			
		}
	}
	public String toString()
	{
		String str="";
		if(size()==0)
		{
			return "[]";
		}
		
		else
		{
			
			Node temp=first;
			str="["+temp.ele;
			for(int i=1;i<=size();i++)
			{
				str=str+temp.ele+",";
				temp=temp.next;
			}
			return str+"]";
		}
	}

}
