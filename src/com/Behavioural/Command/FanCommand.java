package com.Behavioural.Command;

public class FanCommand implements Command{

	private Fan fan;

	public FanCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.on();
	}

	@Override
	public void undo() {
		fan.off();
	}
	
}
