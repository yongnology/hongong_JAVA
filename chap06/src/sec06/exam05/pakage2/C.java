package sec06.exam05.pakage2;	// ��Ű���� �ٸ�
//�ʵ�� �޼ҵ��� ��������(3)
import sec06.exam05.pakage1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//(o)
		a.field2 = 1;	//(x) default �ʵ� ���� �Ұ�(������ ����)
		a.field3 = 1;	//(x) private �ʵ� ���� �Ұ�(������ ����)
		
		a.method1();	//(o)
		a.method2();	//(x) default �޼ҵ� ���� �Ұ�(������ ����)
		a.method3();	//(o) private �޼ҵ� ���� �Ұ�(������ ����)
	}
}
