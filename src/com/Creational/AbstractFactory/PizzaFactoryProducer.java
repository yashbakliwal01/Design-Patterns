package com.Creational.AbstractFactory;

public class PizzaFactoryProducer {
	public AbstractPizzaFactory getFactory(String type) {
		switch(type) {
			case "Dominos":
				return new DominosPizzaFactory();
				
			case "PizzaHut":
				return new PizzaHutFactory();
			
			default:
				throw new RuntimeException("Factory does not exist");
		}
			
	}
}
