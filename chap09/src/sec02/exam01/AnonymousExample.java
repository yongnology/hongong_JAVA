package sec02.exam01;
// �͸� �ڽ� ��ü ����
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymos anony = new Anonymos();
		// �͸� ��ü �ʵ� ���
		anony.field.wake();
		// �͸� ��ü ���� ���� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(
			new Person() {
				void study() {
					System.out.println("�����մϴ�.");
				}
				@Override
				void wake() {
					System.out.println("8�ÿ� �Ͼ�ϴ�.");
					study();
				}
			});
	}
}
/* ��°�
6�ÿ� �Ͼ�ϴ�.
����մϴ�.
7�ÿ� �Ͼ�ϴ�.
��å�մϴ�.
8�ÿ� �Ͼ�ϴ�.
�����մϴ�.
*/