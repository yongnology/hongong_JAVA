package sec01.exam07.pack2;
import sec01.exam07.pack1.*;

public class C {
	public void method() {
		// 접근이 불가능하다.
		A a = new A();
		a.field = "value";
		a.method();
		}
		// 접근이 불가능하다.
}
