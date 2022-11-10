package designpattern4;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		System.out.println("VLC file played using Mp4Player.");
		
	}

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		System.out.println("MP4 file played using Mp4Player.");
	}
	
}
