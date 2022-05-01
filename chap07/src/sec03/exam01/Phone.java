package sec03.exam01;
// 추상 클래스
public abstract class Phone {
	// 필드(Field)
	public String owner;
	
	// 생성자(Constructor)
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 메소드(Method)
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
