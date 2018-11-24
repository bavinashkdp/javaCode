package com.jspiders.javaApp.MultiThreading;

public class SecondThread implements Runnable 
{
	public SecondThread() 
	{
		new Thread(this).start();
	}

	@Override
	public void run() 
	{
		for(int i=0;i<=25;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
