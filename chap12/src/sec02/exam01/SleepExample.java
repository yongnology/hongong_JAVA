package sec02.exam01;
//3�� �ֱ�� 10�� ������ �߻�
import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
				// 3�� ���� ���� �����带 �Ͻ� ���� ���·� ����
			} catch (InterruptedException e) {

			}
		}
	}

}
// 3�� �ֱ�� ����(beep���� 10�� �߻�)