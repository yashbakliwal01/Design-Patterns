package com.Creational.Factory;

public class PizzaFactory {
	public Pizza getPizza(PizzaType type) {
		switch(type) {
		case MARGHERITA:
			return new Margherita();
			
		case VEGGIE:
			return new Veggie();
		
		case DOUBLE_CHEESE:
			return new DoubleCheese();
		
		default:
			throw new RuntimeException("Pizza not invented yet");
		}
	}
}
