package sec03.exam01;
// 실행 클래스
public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone();
		// Phone의 생성자를 호출해서 객체를 생성할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();	// phone의 메소드
		smartPhone.internetSearch();	// SmartPhone의 메소드
		smartPhone.turnOff();	// phone의 메소드
	}
}
/* 출력값
폰 전원을 켭니다.
인터넷을 검색을 합니다.
폰 전원을 끕니다.
*/