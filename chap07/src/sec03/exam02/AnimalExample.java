package sec03.exam02;
// 실행 클래스
public class AnimalExample {
// sound 메소드를 호출하는 세가지 방법
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// 변수의 자동 타입 변환
		Animal animal = null;	// 초기화
		animal = new Dog();		// 타입 변환
		animal.sound();			// 자식클레스 메소드
		animal = new Cat();		// 타입 변환
		animal.sound();			// 자식클레스 메소드
		System.out.println("-----");
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
/* 출력값
멍멍
야옹
-----
멍멍
야옹
-----
멍멍
야옹
*/