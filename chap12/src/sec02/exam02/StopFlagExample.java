package sec02.exam02;
// 1�� �� ��� �����带 ����
import java.awt.Toolkit;

// 1�� �� ��� �����带 ����
public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
	}

}
/* ��°�
���� ��
���� ��
���� ��
������(1�ʵ��� ��� �ݺ� ��)
�ڿ�����
���� ����
*/