package sec02.question.exam01;
// �͸� ���� Ŭ������ ��ü ����
public class AnonymousExample {
	public static void main(String args[]) {
		Anonymous anony = new Anonymous();
		// �͸�ü �ʵ� ���
		anony.field.start();
		// �͸� ��ü ���ú��� ���
		anony.method1();
		// �͸� ��ü �Ű��� ���
		anony.method2(new Worker(){
			@Override
			public void start() {
				System.out.println("�׽�Ʈ�� �մϴ�.");
			}
		});
	}
}
/* ��°�
�������� �մϴ�.
������ �մϴ�.
�׽�Ʈ�� �մϴ�.
*/