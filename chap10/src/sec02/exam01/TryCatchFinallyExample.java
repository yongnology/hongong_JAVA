package sec02.exam01;
// �Ϲ� ���� ó��
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {	// ���� ���� ����
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("�������");
			
			// ���ܰ� �߻��Ѵٸ� ����
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
/* ��°�
Ŭ������ �������� �ʽ��ϴ�.
*/