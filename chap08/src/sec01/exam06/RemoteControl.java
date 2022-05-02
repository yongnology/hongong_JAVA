package sec01.exam06;
// 추상 메소드 선언
public interface RemoteControl {
	// 상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	/*public abstract 가 생략되어 있다.*/
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
