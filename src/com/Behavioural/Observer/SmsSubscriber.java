package com.Behavioural.Observer;

public class SmsSubscriber implements Subscriber{
	
	private final String phonenumber;

	public SmsSubscriber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public void notify(String message) {
		System.out.println("SMS sent to "+ phonenumber+": " + message);
	}

}
