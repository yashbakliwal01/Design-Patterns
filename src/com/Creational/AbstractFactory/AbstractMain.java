package com.Creational.AbstractFactory;

import com.Creational.Factory.PizzaFactory;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactoryProducer factoryProducer = new PizzaFactoryProducer();
		
		AbstractPizzaFactory dominosFactory = factoryProducer.getFactory("Dominos");
		Pizza pizza1 = dominosFactory.getPizza(PizzaType.PANEER);
		pizza1.name();
		
		AbstractPizzaFactory phFactory = factoryProducer.getFactory("Dominos");
		Pizza pizza2 = phFactory.getPizza(PizzaType.VEGGIE);
		pizza2.name();
		
	}

}
