package designpattern4;

public class MediaAdapter implements AdvancedMediaPlayer {
	private MediaPlayer mediaPlayer;

	public MediaAdapter(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		this.mediaPlayer.play();

	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		this.mediaPlayer.play();
	}

}
