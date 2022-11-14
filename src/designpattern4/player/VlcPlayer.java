package designpattern4.player;

import designpattern4.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{
	
	
	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		System.out.println("File is played using VlcPlayer.");
		
	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		System.out.println("File is played using VlcPlayer.");
	}
	
	
}
