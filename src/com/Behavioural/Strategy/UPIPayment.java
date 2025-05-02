package com.Behavioural.Strategy;

import java.util.UUID;

public class UPIPayment implements PaymentStrategy{

	private String upiId;
	private UpiApp UPIApp;
	
	public UPIPayment(String upiId, UpiApp app) {
		this.upiId = upiId;
		UPIApp = app;
	}

	@Override
	public void payment(int amount) {
		String transId = generateTransactionId();
		System.out.println("Paid Rs. " + amount + " via using upi app: " + UPIApp + "(UPI ID: " + upiId + ", TransactionId: " + transId+")");
	}
	
	public String generateTransactionId()	{
		return "TXN-"+UUID.randomUUID().toString().substring(0, 10).toUpperCase();
	}

}
