package sec01.exam01;
// ���� �����常 �̿��� ���
import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Toolkit ��ü ���
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
/* ��°�
// �Ҹ� 5�� ��� �� �ܼ� â ����
��
��
��
��
��
*/