package com.Creational.Singleton;

class Sample{
	private static Sample INSTANCE = null;
	private Sample() {}
	
	
	//two threads comes here in parallel
	public static Sample getInstance() {
		if(INSTANCE==null) {
			//but this block takes one be one using synchronized 
			synchronized (Sample.class) {
				if(INSTANCE==null) {
					System.out.println("New Instance created");
					INSTANCE = new Sample();
				}
			}
		}
		return INSTANCE;
	}
}

public class Singleton_Example {

	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()-> Sample.getInstance());
		Thread t2 = new Thread(()-> Sample.getInstance());
		Thread t3 = new Thread(()-> Sample.getInstance());
		Thread t4 = new Thread(()-> Sample.getInstance());
		
		t1.start();
		t2.start();
		
		Thread.sleep(500);
		t3.start();
		t4.start();
		
		
	}

}
