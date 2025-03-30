package com.Structural.Decorator;

public class WhippedCream extends CoffeeDECORATOR{

	public WhippedCream(Coffee coffee) {
		super(coffee,"Whipped Cream");
	}
	
	public double getCost() {
		return coffee.getCost()+90.0;
	}

}
