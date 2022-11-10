package designpattern4;

public class AudioPlayer implements MediaPlayer {
	
	public void playMp3() {
		System.out.println("MP3 file is played.");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("File played using AudioPlayer.");
	}

}
