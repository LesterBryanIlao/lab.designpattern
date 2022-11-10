package designpattern4;

public class AudioMediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public AudioMediaPlayer(AdvancedMediaPlayer advancedMediaPlayer) {
		// TODO Auto-generated constructor stub
		this.advancedMediaPlayer = advancedMediaPlayer;
	}
	
	public void playMp4Media() {
		advancedMediaPlayer.playMp4();
	}
	
	public void playVlcMedia() {
		advancedMediaPlayer.playVlc();
	}
}
