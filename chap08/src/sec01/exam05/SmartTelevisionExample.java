package sec01.exam05;
// 인터페이스 변수에 구현 객체 대입
public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		Searchable searchable = tv;
		searchable.search("http://www.naver.com");
	}

}
/* 출력값
TV를 켭니다.
현재 볼륨 : 5
TV를 끕니다.
http://www.naver.com을 검색합니다.
*/