package com.multithreading;

class UserThread extends Thread{
	public void run()
	{
		System.out.println("this is user defined thread");
	}
}




public class ThreadOp {
	public static void main(String[] args) {
		System.out.println("Program started...");
		int x=56+34;
		System.out.println("sum is = "+x);
		
		//Thread...
		Thread currentThread = Thread.currentThread();
		String tname = currentThread.getName();
		System.err.println("current name of the thread is = "+tname);
		
		
		//SetName
		currentThread.setName("MyMain");
		System.err.println(currentThread.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//get id
		System.out.println(currentThread.getId());
		
		//going to start user defined thread
		
		System.out.println("Program ended...");
		UserThread userThread = new UserThread();
		userThread.start();
	}
}
