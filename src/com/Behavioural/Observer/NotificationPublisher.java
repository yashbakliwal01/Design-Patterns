package com.Behavioural.Observer;

public interface NotificationPublisher {

	void subscribe(Subscriber subscriber);
	void unsubscribe(Subscriber subscriber);
	void notifySubscribers(String message);
	
}
