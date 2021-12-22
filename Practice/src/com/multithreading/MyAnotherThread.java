package com.multithreading;

//Create thread using another class
public class MyAnotherThread extends Thread {
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("value i is = "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
//	public static void main(String[] args) {
//		MyAnotherThread t2=new MyAnotherThread();
//		t2.start();
//	}
}
