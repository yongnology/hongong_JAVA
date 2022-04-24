package sec04.exam05;
// 클래스 외부에서 메소드 호출
public class Car {
	// 필드(field)
	int speed;
	
	// 생성자(Constructor)
	
	// 메소드(Method)
	int getSpeed() {
		return speed;
	}
	
	void keyTrunOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속:"+ speed + "km/h)");
		}
	}
}
