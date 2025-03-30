package com.Creational.Factory;

public class Factory_Pizza_Example {

	public static void main(String[] args) {

		PizzaFactory factory = new PizzaFactory();
		Pizza pizza1 = factory.getPizza(PizzaType.MARGHERITA);
		pizza1.name();
		
		Pizza pizza2 = factory.getPizza(PizzaType.VEGGIE);
		pizza2.name();
	}

}
