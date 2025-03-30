package com.Structural.Decorator;

public class Espresso implements Coffee{

	@Override
	public String getDescription() {
		return "ESPRESSO";
	}

	@Override
	public double getCost() {
		return 179.0;
	}

}
