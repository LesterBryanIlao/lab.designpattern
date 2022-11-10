package designpattern4;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		VlcPlayer vlcPlayer = new VlcPlayer();
		
		AudioMediaPlayer audioMediaPlayer1 = new AudioMediaPlayer(vlcPlayer);
		audioMediaPlayer1.playMp4Media();
		audioMediaPlayer1.playVlcMedia();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Mp4Player mp4Player = new Mp4Player();
		AudioMediaPlayer audioMediaPlayer2 = new AudioMediaPlayer(mp4Player);
		audioMediaPlayer2.playMp4Media();
		audioMediaPlayer2.playVlcMedia();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.playMp3();
		MediaAdapter mediaAdapter = new MediaAdapter(audioPlayer);
		AudioMediaPlayer audioMediaPlayer3 = new AudioMediaPlayer(mediaAdapter);
		audioMediaPlayer3.playMp4Media();
		audioMediaPlayer3.playVlcMedia();
		
		
	}

}
