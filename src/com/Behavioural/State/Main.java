package com.Behavioural.State;

public class Main {

	public static void main(String[] args) {

		MediaPlayer media = new MediaPlayer();
		media.pressPlay();
		media.pressStop();
		
		media.pressPlay();
		media.pressPause();
		media.pressPlay();
		media.pressStop();
		
		media.pressPlay();
	}

}
