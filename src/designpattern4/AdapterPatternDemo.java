package designpattern4;

import designpattern4.adapter.MediaAdapter;
import designpattern4.enums.FileFormats;
import designpattern4.interfaces.MediaPlayer;
import designpattern4.player.AudioPlayer;
import designpattern4.player.Mp4Player;
import designpattern4.player.VlcPlayer;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		VlcPlayer vlcPlayer = new VlcPlayer();
		Mp4Player mp4Player = new Mp4Player();
		
		
		MediaPlayer basicMediaPlayer = new AudioPlayer();
		
		MediaPlayer mediaPlayer1= new AudioPlayer(new MediaAdapter(vlcPlayer));
		MediaPlayer mediaPlayer1WithMp4 = new AudioPlayer(new MediaAdapter(mp4Player, FileFormats.MP4));
		MediaPlayer mediaPlayer1WithVLC = new AudioPlayer(new MediaAdapter(mp4Player, FileFormats.VLC));
		
		MediaPlayer mediaPlayer2= new AudioPlayer(new MediaAdapter(mp4Player));
		MediaPlayer mediaPlayer2WithMp4 = new AudioPlayer(new MediaAdapter(mp4Player, FileFormats.MP4));
		MediaPlayer mediaPlayer2WithVLC = new AudioPlayer(new MediaAdapter(mp4Player, FileFormats.VLC));

		basicMediaPlayer.play();
	
		System.out.println();
		
		mediaPlayer1.play();
		mediaPlayer1WithMp4.play();
		mediaPlayer1WithVLC.play();
		
		System.out.println();
		
		mediaPlayer2.play();
		mediaPlayer2WithMp4.play();
		mediaPlayer2WithVLC.play();
		
		
		
	}

}
