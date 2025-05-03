package com.Behavioural.State;

public class PausedState implements PlayerState {

	@Override
	public void pressPlay(MediaPlayer player) {
		System.out.println("Resuming media...");
		player.setState(new PlayingState());
	}

	@Override
	public void pressPause(MediaPlayer player) {
		System.out.println("Already paused.");
	}

	@Override
	public void pressStop(MediaPlayer player) {
		System.out.println("Stopping the media...");
		player.setState(new StoppedState());
	}

}
