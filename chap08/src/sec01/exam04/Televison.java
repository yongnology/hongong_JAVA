package sec01.exam04;
// 구현 클래스
public class Televison implements RemoteControl{
	// 필드
	private int volume;
	
	@Override
	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	// setVolume() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {		// 10보다 크다면
			this.volume = RemoteControl.MAX_VOLUME;	// 10으로 설정
		} else if(volume<RemoteControl.MIN_VOLUME) {	// 0보다 작다면
			this.volume = RemoteControl.MIN_VOLUME;		// 0으로 설정
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+ this.volume);
		}
}

