package com.Behavioural.Command;

public class Command_Main {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light livingRoomLight = new Light();
		Fan ceilingFan = new Fan();
		
		//Light-ON
		remote.setCommand(new LightCommand(livingRoomLight));
		remote.pressButton();
		
		//if we want Light - OFF
		remote.pressUndo();
		
	
		//FAN to make  ON
		remote.setCommand(new FanCommand(ceilingFan));
		remote.pressButton();
		
		//FAN to be made OFF
		remote.pressUndo();
	}

}
