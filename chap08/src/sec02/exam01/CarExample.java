package sec02.exam01;
// 필드 다형성 테스트
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}

}
/* 출력값
한국 타이어가 굴러갑니다.
한국 타이어가 굴러갑니다.
한국 타이어가 굴러갑니다.
한국 타이어가 굴러갑니다.
금호 타이어가 굴러갑니다.
금호 타이어가 굴러갑니다.
한국 타이어가 굴러갑니다.
한국 타이어가 굴러갑니다.
*/