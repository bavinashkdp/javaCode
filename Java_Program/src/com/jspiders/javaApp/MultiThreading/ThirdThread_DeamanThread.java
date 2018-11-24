package com.jspiders.javaApp.MultiThreading;

public class ThirdThread_DeamanThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println("deaman thread.....");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[]args)
	{
		System.out.println("main method is started");
		Thread thread=new ThirdThread_DeamanThread();
		thread.setDaemon(true);
		thread.start();
		for(int i=0;i<20;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main method is ended");
	}
	

}
