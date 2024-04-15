package sec2;

public interface RemoteControl {

	int Max = 10;
	int Min = 0;
	
	void turnOff();
	public void turnOn();
	public void setVolume(int voulume);
	default void setMute(boolean mute) {
		if(mute) System.out.println("무음처리");
		else System.out.println("무음 해제");

	
	}
	
	
	static void chageBattery() {
		System.out.println("건전지 교체");
	}
}

