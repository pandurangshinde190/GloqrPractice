package com.methodreference;

import java.time.LocalDate;

public class Stuff {
	public static void doStuff() {
		System.out.println("I am doing task");
		System.out.println("this is second line");
		System.out.println("Date is = " + LocalDate.now());
		;
	}

	public static void threadTask() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Table is =" + i * 2);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public void printNumber() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Number is =" +i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
}
