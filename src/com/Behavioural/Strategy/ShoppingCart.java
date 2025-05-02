package com.Behavioural.Strategy;

public class ShoppingCart {
	
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkOut(int amount) {
		if(paymentStrategy==null) {
			System.out.println("Please elect payment method.");
		}else {
			paymentStrategy.payment(amount);
		}
	}
}
