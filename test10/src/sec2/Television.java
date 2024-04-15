package sec2;

public class Television implements Screen{

	int volume;
	
	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원 ON");
		
	}

	@Override
	public void setVolume(int voulume) {
		if(volume > Max) {
			this.volume = RemoteControl.Max;
		}	else if(volume < Min) {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		Screen.super.setMute(mute);
	}

	@Override
	public int light() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int dark() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zoomin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int zoomout() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
