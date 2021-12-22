package com.aop.services;

public class PaymentServiceImp implements PaymentService {

	public void makePayment(int amount) {
		
		//payment code
		
		System.out.println(amount+" Amount Debited...");
		//
		//
		//
		
		System.out.println(amount+" Amount Credited...");
	}

}
