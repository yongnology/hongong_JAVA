package sec02.question.exam04;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
}
/* ��°�
�������� ����մϴ�.
�������� ����մϴ�.
�������� ����մϴ�.
(3�ʵ��� ��� �� ����)
*/