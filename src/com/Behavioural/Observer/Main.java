package com.Behavioural.Observer;

public class Main {

	public static void main(String[] args) {

		NotificationService notificationService = new NotificationService();
		
		Subscriber emailSubscriber = new EmailSubscriber("abcd@gmail.com");
		Subscriber smSubscriber = new SmsSubscriber("9876543210");
		
		notificationService.subscribe(emailSubscriber);
		notificationService.subscribe(smSubscriber);
		
		notificationService.publishEvent("Java Workshop is Live!!!");
		notificationService.publishEvent("App update is available.");
	}

}
