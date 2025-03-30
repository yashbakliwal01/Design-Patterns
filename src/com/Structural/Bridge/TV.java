package com.Structural.Bridge;

public class TV implements Device{
	public boolean isOn = false;

	@Override
	public boolean isOn() {
		if(isOn) {
			System.out.println("TV is ON...");
		}
		else {
			System.out.println("TV is OFF...");
		}
		return isOn;
	}

	@Override
	public void turnOn() {
		System.out.println("TV is getting turn ON");
		isOn = true;
	}

	@Override
	public void turnOff() {
		System.out.println("TV is getting turn OFF");
		isOn = false;
	}
	
}
