package com.Structural.Decorator;

public class Cappuccino implements Coffee{

	@Override
	public String getDescription() {
		return "Cappucino";
	}

	@Override
	public double getCost() {
		return 149.0;
	}

}
