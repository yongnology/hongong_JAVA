package sec02.exam03;
// 1�� �� ��� �����带 ����
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1);
		} catch(InterruptedException e) {}
		
		thread.interrupt();
		// �����带 �����ϱ� ���� InterruptedException�� �߻���Ŵ
	}
}
/* ��°�
������
������
�ڿ� ����
���� ����
*/