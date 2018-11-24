package com.jspiders.javaApp.MultiThreading;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("main started......");
		/*Runnable runnable=new SecondThread();
		Thread thread=new Thread(runnable);
		thread.start();*/
		new SecondThread();
		for(char c='A';c<='Z';c++)
		{
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("main ended......");
	}

}
