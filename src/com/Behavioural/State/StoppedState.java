package com.Behavioural.State;

public class StoppedState implements PlayerState{

	@Override
	public void pressPlay(MediaPlayer player) {
		System.out.println("Starting the media...");
		player.setState(new PlayingState());
	}

	@Override
	public void pressPause(MediaPlayer player) {
		System.out.println("Can't pause. Media is stopped.");
	}

	@Override
	public void pressStop(MediaPlayer player) {
		System.out.println("Already stopped.");
	}

}
