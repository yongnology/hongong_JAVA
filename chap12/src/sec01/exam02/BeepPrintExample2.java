package sec01.exam02;
// ���� ������� �۾� �����尡 ���ÿ� ����
public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	//BeebTask.java�� void run ����
		
		for(int i = 0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500);}
			catch(Exception e) {}
		}
	}
}
/* ��°�
// �Ҹ��� �Բ�
��
��
��
��
��
*/