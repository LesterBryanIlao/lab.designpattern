package designpattern4;

public class VlcPlayer implements AdvancedMediaPlayer{
	
	
	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		System.out.println("VLC file played using VlcPlayer.");
		
	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		System.out.println("MP4 file played using VlcPlayer.");
	}
	
	
}
