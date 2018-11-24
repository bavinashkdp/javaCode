package com.jspiders.javaApp.clone;

class A implements Cloneable
{
	int i;
	int j;
	@Override
	public String toString() {
		return "A [i=" + i + ", j=" + j + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

public class Cloning 
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		A a=new A();
		 a.i=5;
		 a.j=6;
		 System.out.println(a);
		 //shallow copy one object is created 
		 //we are creating 2 references 
		 //both references are pointing to same intance
		 //if the changes made by one object reference 
		 //it will effect another object reference also;
		
		/* A a2= a;
		 System.out.println(a);
		  System.out.println(a2);
		  a2.j=8;
		  System.out.println("**************");
		  System.out.println(a);
		  System.out.println(a2);*/
		System.out.println("***************************************************");
		//deep copy
		// we are creating two objects 
		// we are copying the values mannually
/*		A a3=new A();
		a3.i=a.i;
		a3.j=a.j;
		System.out.println(a);
		System.out.println(a3);
		// if the changes made by one object reference 
		//it wont effect the anther reference
		a3.j=9;
		System.out.println(a);
		System.out.println(a3);*/
		
		
		//cloning
		//it is combination of deepcopy and shallow copy
		A a4=(A) a.clone();
		System.out.println(a);
		System.out.println(a4);
		System.out.println("******");
		a4.i=10;
		System.out.println(a);
		System.out.println(a4);
		
		
		 
	}

}
