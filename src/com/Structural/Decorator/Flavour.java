package com.Structural.Decorator;

public class Flavour extends CoffeeDECORATOR{

	public Flavour(Coffee coffee, String flavourType) {
		super(coffee, flavourType + "Flavour");
	}
	
	public double getCost() {
		return coffee.getCost()+70.0;
	}

}
