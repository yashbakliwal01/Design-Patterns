package com.Behavioural.Strategy;

public class Main {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-0987-3409"));
		cart.checkOut(5999);
		
		cart.setPaymentStrategy(new DebitCardStrategy("5679-2311-5909-3188"));
		cart.checkOut(820);
		
		cart.setPaymentStrategy(new UPIPayment("madan@okaxis", UpiApp.PHONE_PE));
		cart.checkOut(23445);
	}
}
