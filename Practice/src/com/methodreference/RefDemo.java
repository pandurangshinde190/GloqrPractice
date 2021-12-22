package com.methodreference;

public class RefDemo {
	public static void main(String[] args) {
		System.out.println("Learning Method Reference...");
		
		
		//provide the implementation of workInter
		
		//static method ko refer kiya
		//Classname::methodname
		WorkInter workInter= Stuff::doStuff;
		
		workInter.doTask();
		
		
//		Runnable runnable=Stuff::threadTask;
//		
//		Thread d=new Thread(runnable);
//		d.start();
		
		
		
		
		//referring non static method
		//Object::methodName
		Stuff ob = new Stuff();
		Runnable runnable2=ob::printNumber;
		Thread thread2 = new Thread(runnable2);
		thread2.start();
	}
}
