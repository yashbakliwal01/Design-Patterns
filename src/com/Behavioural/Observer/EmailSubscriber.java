package com.Behavioural.Observer;

public class EmailSubscriber implements Subscriber{

	private final String email;
	
	public EmailSubscriber(String email) {
		super();
		this.email = email;
	}

	@Override
	public void notify(String message) {
		System.out.println("Email sent to " + email + ": "+message);
	}

}
