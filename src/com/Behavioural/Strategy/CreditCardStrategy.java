package com.Behavioural.Strategy;

public class CreditCardStrategy implements PaymentStrategy{

	private String cardNumber;
	
	public CreditCardStrategy(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void payment(int amount) {
		System.out.println("Paid Rs. "+amount+" by using Credit Card: "+cardNumber);
	}

}
