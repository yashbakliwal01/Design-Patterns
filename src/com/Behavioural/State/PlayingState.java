package com.Behavioural.State;

public class PlayingState implements PlayerState{

	@Override
	public void pressPlay(MediaPlayer player) {
		System.out.println("Already playing the song!");
	}

	@Override
	public void pressPause(MediaPlayer player) {
		System.out.println("Pausing the media...");
		player.setState(new PausedState());
	}

	@Override
	public void pressStop(MediaPlayer player) {
		System.out.println("Stopping the media");
		player.setState(new StoppedState());
	}

}
