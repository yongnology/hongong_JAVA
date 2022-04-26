package sec05.exam03;
// 정적 메소드 선언시 주의할 점
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;	// 바로 사용할 수 없어서 .speed로 도트 연산자로 접근
		myCar.run();		// 바로 사용할 수 없어서 .speed로 도트 연산자로 접근
	}
}
/* 출력값
60으로 달립니다.
*/