package sec02.exam01;
// 필드 다형성
public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire BackLeftTire = new HankookTire();
	Tire BackRightTire = new HankookTire();
	
	// roll() 메소드 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
