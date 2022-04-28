package chap07.sec01.exam07.pack1;

public class B {
	public void method() {
		// 동일 패키지지. 접근 가능
		A a = new A();
		a.field = "value";
		a.method();
		// 동일 패키지지. 접근 가능
	}
}
