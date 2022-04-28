package chap07.sec01.exam07.pack2;
// A, B 클래스와 다른 패키지
import chap07.sec01.exam07.pack1.A;

public class C {
	public void method() {
		// 접근이 불가능하다.
		A a = new A();
		a.field = "value";
		a.method();
		}
		// 접근이 불가능하다.
}
