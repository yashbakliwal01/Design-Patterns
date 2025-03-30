package com.Structural.Facade;

public class Main_FacadeExample {

	public static void main(String[] args) {
		Computer computer = new Computer(new Memory(), new CPU(), new HardDisk());
		computer.turnOn();
	}

}
