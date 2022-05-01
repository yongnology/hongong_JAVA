package sec02.exam06;
// ��ü Ÿ�� Ȯ��
public class InstancefExample {

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child�� ��ȯ ����");
		} else {
			System.out.println("method1 - child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// ClassCastException�� �߻��� ���ɼ� ����
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		// Child ��ü�� �Ű������� ����
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}

}
/* ��°�
method1 - Child�� ��ȯ ����
method2 - Child�� ��ȯ ����
method1 - child�� ��ȯ���� ����
Exception in thread "main" java.lang.ClassCastException
*/