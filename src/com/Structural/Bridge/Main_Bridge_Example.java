package com.Structural.Bridge;

public class Main_Bridge_Example {
	public static void main(String[] args) {
		Remote acRemote = new Remote(new AirConditioner());
		acRemote.togglePower();
		acRemote.togglePower();
		
		Remote tvRemote = new Remote(new TV());
		tvRemote.togglePower();
		tvRemote.togglePower();
	}
}
