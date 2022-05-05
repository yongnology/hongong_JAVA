package sec01.exam03;
// 멤버 클래스에서 사용 제한
public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			// 아래 두개는 A클래스가 있어야 사용할 수 있다.
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
