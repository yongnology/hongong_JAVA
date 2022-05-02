package sec01.exam04;
// 인터페이스 변수에 구현 객체 대입
public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Televison();
		rc.turnOn();
		rc.turnOff();
		System.out.println("------");
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
/* 출력값
TV를 켭니다.
TV를 끕니다.
------
Audio를 켭니다.
Audio를 끕니다.
*/