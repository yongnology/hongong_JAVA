package sec02.exam03;

public class Car {
	// 필드(Field)
	// 자동차 4개 Tire
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire BackLeftTire = new Tire("뒤왼쪽", 3);
	Tire BackRightTire = new Tire("뒤오른쪽", 4);
	
	// 생성자(Constructor)
	
	// 메소드(Method)
	// 모든 타이어를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드 호출
	// false를 리턴하는 roll()이 있을 경우 stop() 메소드를 호출,
	// 해당 Tire 번호를 리턴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll()==false) {
			stop(); return 1;
		}
		if(frontRightTire.roll()==false) {
			stop(); return 2;
		}
		if(BackLeftTire.roll()==false) {
			stop(); return 3;
		}
		if(BackRightTire.roll()==false) {
			stop(); return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
