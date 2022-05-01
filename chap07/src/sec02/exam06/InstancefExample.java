package sec02.exam06;
// 객체 타입 확인
public class InstancefExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// ClassCastException이 발생할 가능성 있음
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		// Child 객체를 매개값으로 전달
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}
/* 출력값
method1 - Child로 변환 성공
method2 - Child로 변환 성공
method1 - child로 변환되지 않음
Exception in thread "main" java.lang.ClassCastException
*/