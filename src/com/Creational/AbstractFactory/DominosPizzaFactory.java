package com.Creational.AbstractFactory;

public class DominosPizzaFactory implements AbstractPizzaFactory {

	@Override
	public Pizza getPizza(PizzaType type) {
		switch(type) {
		case MARGHERITA:
			return new PlainCheese();
			
		case VEGGIE:
			return new FarmHouse();	
			
		case PANEER:
			return new PaneerLoaded();
		default:
			throw new RuntimeException("Pizza not invented yet");
		}
	}
}
