package com.Structural.Decorator;

public class ColdCoffee implements Coffee{

	@Override
	public String getDescription() {
		return "Thick Cold Coffee with Crush";
	}

	@Override
	public double getCost() {
		return 80.0;
	}

}
