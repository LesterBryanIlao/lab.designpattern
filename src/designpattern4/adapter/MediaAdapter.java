package designpattern4.adapter;

import designpattern4.enums.FileFormats;
import designpattern4.interfaces.AdvancedMediaPlayer;
import designpattern4.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;
	private FileFormats fileFormats = null;

	public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer, FileFormats fileFormats) {
		this.advancedMediaPlayer = advancedMediaPlayer;
		this.fileFormats = fileFormats;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (fileFormats != null) {
			System.out.println(String.format("%s is played", fileFormats.toString()));
		} else {
			this.advancedMediaPlayer.playMp4();
			this.advancedMediaPlayer.playVlc();
		}

	}

}
