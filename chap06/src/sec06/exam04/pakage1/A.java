package sec06.exam04.pakage1;
// ������ ���� ����(1)
public class A {
	// �ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�");
	
	// ������
	public A(boolean b) {	// (o) public ���� ����
	}
	A(int b) {				// (o) default ���� ����
	}
	private A(String s) {	// (o) private ���� ����
	}
}
