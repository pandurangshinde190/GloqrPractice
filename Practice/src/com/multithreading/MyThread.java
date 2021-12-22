package com.multithreading;

//Creating our thread using Runnable Interface
public class MyThread implements Runnable{

	@Override
	public void run()
	{
			for(int i=0;i<=10;i++)
			{
				System.out.println("value of i is = "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
	
	public static void main(String[] args) {
		MyThread t1=new MyThread();
		Thread thread = new Thread(t1);
		
		
		//object of another thread
		MyAnotherThread t2=new MyAnotherThread();
		thread.start();
		t2.start();
	}

}
