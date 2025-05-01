package com.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements NotificationPublisher{

	private List<Subscriber> subscribers = new ArrayList<>();
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscribers(String message) {
		for(Subscriber s : subscribers) {
			s.notify(message);
		}
	}
	
	public void publishEvent(String event) {
		System.out.println("Publishing: " + event);
		notifySubscribers("New Notification: "+event);
	}

}
