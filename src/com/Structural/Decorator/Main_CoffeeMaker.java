package com.Structural.Decorator;

public class Main_CoffeeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee c1 = new SimpleCoffee();
		System.out.println(c1.getDescription()+" -> Cost: Rs. "+c1.getCost());
		
		
		Coffee c2 = new DarkCoffee();
		System.out.println(c2.getDescription()+" -> Cost: Rs. "+c2.getCost());
		
		Coffee c3 = new ColdCoffee();
		System.out.println(c3.getDescription()+" -> Cost: Rs. "+c3.getCost());
		
		Coffee c4 = new SimpleCoffee();
		c4 = new WhippedCream(c4);
		System.out.println(c4.getDescription() + " -> Cost: Rs. " +c4.getCost());
		
		Coffee c5 = new DarkCoffee();
		c5 = new WhippedCream(c5);
		System.out.println(c5.getDescription() + " -> Cost: Rs. " +c5.getCost());
		
		Coffee c6 = new SimpleCoffee();
		c6 = new Flavour(c6, "Chocolate");
		System.out.println(c6.getDescription()+" -> Cost: Rs. "+c6.getCost());
		
		Coffee c7 = new SimpleCoffee();
		c5 = new Flavour(c7, "Chocolate");
		System.out.println(c7.getDescription()+" -> Cost: Rs. "+c7.getCost());
		
		Coffee c8 = new Espresso();
		System.out.println(c8.getDescription()+" -> Cost: Rs. "+c8.getCost());
		
		Coffee c9 = new LatteCoffee();
		System.out.println(c9.getDescription()+" -> Cost: Rs. "+c9.getCost());
		
	}

}
