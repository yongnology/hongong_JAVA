package sec03.exam03;
// 생성자의 오버로딩
public class Car {
	// 필드(field)
	String company = "현대자동차";
	String model;	// null 로 디폴트값 초기화
	String color;	// null 로 디폴트값 초기화
	int maxSpeed;	// 0 으로 디폴티값 초기화
	
	// 생성자(Constructor)
	// 1) 생성자
	Car() {
		
	}
	// 2) 생성자
	Car(String model) {
		this.model = model;
	}
	// 3) 생성자
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// 4) 생성자
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
