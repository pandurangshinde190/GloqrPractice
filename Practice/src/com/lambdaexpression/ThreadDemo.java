package com.lambdaexpression;

public class ThreadDemo {
	public static void main(String[] args) {
		
		//First Thread :Thread-JOHN
		
		Runnable thread1=() -> {
			//this is body of thread
			//stuff
			for(int i=1;i<=10;i++)
			{
				System.out.println("value of = "+i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			};
			
			Thread t=new Thread(thread1);
			t.setName("JOHN");
			t.start();
			
			
			Runnable t2 = () ->
			{
				try {
					for(int i=1;i<=10;i++)
					{
						System.out.println("Table is = "+i*2);
						Thread.sleep(2000);
					}
					
				} catch (InterruptedException e2) {
					// TODO: handle exception
				}
			};
			Thread t3=new Thread(t2);
			
			t3.start();
			}
}
