package com.Behavioural.State;

public class MediaPlayer {
	
	private PlayerState currentState;
	
	public MediaPlayer() {
		currentState = new StoppedState();
	}

	public void setState(PlayerState state) {
		currentState = state;
	}
	
	public void pressPlay() {
		currentState.pressPlay(this);
	}
	
	public void pressPause() {
		currentState.pressPause(this);
	}
	
	public void pressStop() {
		currentState.pressStop(this);
	}
}
