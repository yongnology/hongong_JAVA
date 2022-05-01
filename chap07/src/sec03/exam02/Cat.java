package sec03.exam02;
// 추상 메소드 재정의
public class Cat extends Animal{
	// 자식클래스는 sound() 메소드를 재정의 하지 않으면 오류가 난다.
	
	public Cat() {
		this.kind = "포유류";
	}
	
	// 추상 메소드 제정의
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
