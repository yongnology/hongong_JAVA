package sec02.exam05;
// ���� ó�� ���ѱ��
public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace(); : ���ܰ� ���� ��� �߻��ߴ��� ���
			// �� �ڵ�� ���� �������� �ʿ��ϰ�, �Ϸ��Ŀ��� �������� ����ó�� ������ �����Ѵ�.
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
