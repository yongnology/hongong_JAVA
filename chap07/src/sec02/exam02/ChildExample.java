package sec02.exam02;
//자동 타입 변환 후의 멤버 접근
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// 자동 타입 변환
		parent.method1();
		parent.method2();		// Child에서 재정의된 메소드 호출
		// parent.method3();	// 타입 변환 되었기 떄문에 호출 불가능
	}
}
/* 출력값
parent-method1()
Child-method()
*/