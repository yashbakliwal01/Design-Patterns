package com.Structural.Decorator;

public class SimpleCoffee implements Coffee{

	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

	@Override
	public double getCost() {
		return 50.0;
	}

}
