package com.Structural.Facade;

public class Computer {
	private Memory memory;
	private CPU cpu;
	private HardDisk disk;
	
	public Computer(Memory memory, CPU cpu, HardDisk disk) {
		this.memory = memory;
		this.cpu = cpu;
		this.disk = disk;
	}
	
	public void turnOn() {
		this.memory.turnOn();
		this.cpu.turnOn();
		this.disk.turnOn();
	}
	
	
}
