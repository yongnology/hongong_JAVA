package sec02.exam02;
//�ڵ� Ÿ�� ��ȯ ���� ��� ����
public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;	// �ڵ� Ÿ�� ��ȯ
		parent.method1();
		parent.method2();		// Child���� �����ǵ� �޼ҵ� ȣ��
		// parent.method3();	// Ÿ�� ��ȯ �Ǿ��� ������ ȣ�� �Ұ���
	}
}
/* ��°�
parent-method1()
Child-method()
*/