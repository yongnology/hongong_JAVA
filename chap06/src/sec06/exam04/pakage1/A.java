package sec06.exam04.pakage1;
// 생성자 접근 제한(1)
public class A {
	// 필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	public A(boolean b) {	// (o) public 접근 제한
	}
	A(int b) {				// (o) default 접근 제한
	}
	private A(String s) {	// (o) private 접근 제한
	}
}
