package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 클래스 객체 참조하는 방법 3가지
		// 첫 번째 방법
		Class clazz = Car.class;
		// 두 번째 방법
		Class clazz2 = Class.forName("sec01.exam08.Car");
		// 세 번째 방법
		Car car = new Car();
		Class clazz3 = car.getClass();	// 
		
		//--------------------//
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		
		System.out.println(clazz.getName());
		// Car클래스의 전체 이름을 알 수 있다.
		System.out.println(clazz.getSimpleName());
		// 클래스 이름만 호출
		System.out.println(clazz.getPackage().getName());
	}
}
/* 출력값
true
true
sec01.exam08.Car
Car
sec01.exam08
*/