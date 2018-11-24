package com.jspiders.javaApp.MultiThreading;

import com.jspiders.javaApp.MultiThreading.FirstThread;

public class Test1 {

	public static void main(String[] args) 
	{
		System.out.println("main started......!!!!!!!!!!!");
		/*Thread thread=new FirstThread();
		thread.start();*/
		new FirstThread();
		for(char c='a';c<='z';c++)
		{
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main ended......!!!!!!!!!!!");
	}

}
