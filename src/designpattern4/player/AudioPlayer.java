package designpattern4.player;

import designpattern4.adapter.MediaAdapter;
import designpattern4.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	public AudioPlayer() {
	}

	public AudioPlayer(MediaAdapter mediaAdapter) {
		this.mediaAdapter = mediaAdapter;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (mediaAdapter == null) {
			System.out.println("Default: MP3 is played.");
		} else {
			mediaAdapter.play();
		}
	}

}
