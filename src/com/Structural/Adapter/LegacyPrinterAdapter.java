package com.Structural.Adapter;

public class LegacyPrinterAdapter implements Printer{

	private LegacyPrinter legacyPrinter;
	
	public LegacyPrinterAdapter(LegacyPrinter legacyPrinter) {
		this.legacyPrinter = legacyPrinter;
	}
	
	@Override
	public void print(String document) {
		legacyPrinter.printLegacy(document);
	}

}
