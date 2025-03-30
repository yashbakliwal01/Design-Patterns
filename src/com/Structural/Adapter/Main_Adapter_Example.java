package com.Structural.Adapter;

public class Main_Adapter_Example {
	public static void main(String[] args) {
		Printer printer = new LegacyPrinterAdapter(new LegacyPrinter());
		printer.print("Hello, Adapter Pattern!");
	}
}
