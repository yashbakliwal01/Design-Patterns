package com.Structural.Decorator;

public abstract class CoffeeDECORATOR implements Coffee{
	protected Coffee coffee;
	protected String name;
	
	public CoffeeDECORATOR(Coffee coffee, String name) {
		this.coffee = coffee;
		this.name = name;
	}
	
	
	public String getDescription() {
		return coffee.getDescription()+" + " + name;
	}
	
	public double getCost() {
		return coffee.getCost();
	}
}
