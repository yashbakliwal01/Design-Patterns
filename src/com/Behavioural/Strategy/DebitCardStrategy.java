package com.Behavioural.Strategy;

public class DebitCardStrategy implements PaymentStrategy{

	private String cardNumber;
	
	public DebitCardStrategy(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void payment(int amount) {
		System.out.println("Paid Rs. "+amount+" by using Debit Card: "+cardNumber);
	}

}