package sec02.exam02;
// 익명 구현 객체 생성
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.turnOn();	// TV를 켭니다.
		anony.field.turnOff();	// TV를 끕니다.
		// 익명 객체 로컬 변수 사용
		anony.method1();		// Audio를 켭니다. 	Audio를 끕니다.
		// 익명 객체 로컬 매개값 사용
		anony.method2(new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV를 켭니다.");	// SmartTV를 켭니다.
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV를 끕니다.");	// SmartTV를 끕니다.
				}
			}
		);
	}
}
/* 출력값
TV를 켭니다.
TV를 끕니다.
Audio를 켭니다.
Audio를 끕니다.
SmartTV를 켭니다.
SmartTV를 끕니다.
*/