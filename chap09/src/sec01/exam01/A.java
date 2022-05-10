package sec01.exam01;
// 중첩 클래스

/** 바깥 클래스 **/
class A {
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	/** 인스턴스 멤버 클래스**/
	class B{
		B() {
			System.out.println("B 객체가 생성됨");
			}
			int field1;
			// static int field1;	// static 필드 선언 불가
			void method1() {}
			// static void method2()	// static method 선언 불가
		}
		
	/** 정적 멤버 클래스 **/
	static class C {
		C() {
			System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		}
	
	void method() {
		/** 로컬 클래스 **/
		class D {
			D() {
				System.out.println("D 객체가 생성됨");
			}
			// 필드
			int field1;
			//static int field2;
			// 로컬 클래스 내부 정적 필드 선언 불가
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
