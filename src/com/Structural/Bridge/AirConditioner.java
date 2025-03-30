package com.Structural.Bridge;

public class AirConditioner implements Device{
	
	private boolean isOn = false;
	
	@Override
	public boolean isOn() {
		if(isOn) {
			System.out.println("AirConditioner is ON....");
		}else {
			System.out.println("AirConditioner is OFF...");
		}
		return isOn;
	}

	@Override
	public void turnOn() {
		System.out.println("AirConditioner is getting turn ON");
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println("AirConditioner is getting turn OFF");
		isOn = false;
	}

}
