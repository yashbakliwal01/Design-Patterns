package com.Structural.Decorator;

public class DarkCoffee implements Coffee{

	@Override
	public String getDescription() {
		return "Dark Coffee";
	}

	@Override
	public double getCost() {
		return 75.0;
	}

}
