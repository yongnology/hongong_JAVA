package sec02.exam05;
// ���� �����尡 �����ϴ� �ڵ�
public class DemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("���� ������ ����");
	}

}
/* ��°�
(1����)
�۾� ������ ������
(1����)
�۾� ������ ������
(1����)
���� ������ ����
*/