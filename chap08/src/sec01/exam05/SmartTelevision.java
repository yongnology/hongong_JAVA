package sec01.exam05;
// 다중 인터페이스 구현 클래스
public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {		// 10보다 크다면
			this.volume = RemoteControl.MAX_VOLUME;	// 10으로 설정
		} else if(volume<RemoteControl.MIN_VOLUME) {	// 0보다 작다면
			this.volume = RemoteControl.MIN_VOLUME;		// 0으로 설정
		} else {
			this.volume = volume;
		}
		System.out.println("현재 볼륨 : "+ this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
