package sec01.exam01;
// ��ø Ŭ����

/** �ٱ� Ŭ���� **/
class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	
	/** �ν��Ͻ� ��� Ŭ����**/
	class B{
		B() {
			System.out.println("B ��ü�� ������");
			}
			int field1;
			// static int field1;	// static �ʵ� ���� �Ұ�
			void method1() {}
			// static void method2()	// static method ���� �Ұ�
		}
		
	/** ���� ��� Ŭ���� **/
	static class C {
		C() {
			System.out.println("C ��ü�� ������"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		}
	
	void method() {
		/** ���� Ŭ���� **/
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}
			// �ʵ�
			int field1;
			//static int field2;
			// ���� Ŭ���� ���� ���� �ʵ� ���� �Ұ�
			void method1() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
