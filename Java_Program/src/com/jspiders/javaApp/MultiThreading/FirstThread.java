package com.jspiders.javaApp.MultiThreading;

public class FirstThread extends Thread 
{
	public FirstThread()
	{
		System.out.println("FirstThread object is created");
		this.start();
	}
	@Override
	public void run() 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
