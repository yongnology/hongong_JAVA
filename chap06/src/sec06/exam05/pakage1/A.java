package sec06.exam05.pakage1;
//�ʵ�� �޼ҵ��� ��������(1)
public class A {
	// �ʵ�(Field)
	public int field1;	// public ���� ����
	int field2;			// default ���� ����
	private int field3;	// private ���� ����
	
	// ������(Constructor)
	public A() {
		field1 = 1;	//(o)
		field2 = 1;	//(o)
		field3 = 1;	//(o)
		
		method1();	//(o)
		method2();	//(o)
		method3();	//(o)
		// Ŭ���� ������ ��� ���� �������� ������ ���� �ʴ´�.
	}
	// �޼ҵ�(method)
	public void method1() {		// public ���� ����
	}
	void method2() {			// default ���� ����
	}
	private void method3() {	// private ���� ����
	}
}
