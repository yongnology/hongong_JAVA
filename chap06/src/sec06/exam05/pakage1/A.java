package sec06.exam05.pakage1;
//필드와 메소드의 접근제한(1)
public class A {
	// 필드(Field)
	public int field1;	// public 접근 제한
	int field2;			// default 접근 제한
	private int field3;	// private 접근 제한
	
	// 생성자(Constructor)
	public A() {
		field1 = 1;	//(o)
		field2 = 1;	//(o)
		field3 = 1;	//(o)
		
		method1();	//(o)
		method2();	//(o)
		method3();	//(o)
		// 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
	}
	// 메소드(method)
	public void method1() {		// public 접근 제한
	}
	void method2() {			// default 접근 제한
	}
	private void method3() {	// private 접근 제한
	}
}
