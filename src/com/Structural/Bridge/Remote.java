package com.Structural.Bridge;

public class Remote {
	private Device device;

	public Remote(Device device) {
		this.device = device;
	}
	
	public void togglePower() {
		if(this.device.isOn()) {
			this.device.turnOff();
		}else {
			this.device.turnOn();
		}
	}
	
	
}
