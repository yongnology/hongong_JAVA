package sec01.question.Exam02;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(
				new MusicRunnable());
		thread2.start();
	}
}
/* ��°�
�������� ����մϴ�.
������ ����մϴ�.
�������� ����մϴ�.
������ ����մϴ�.
������ ����մϴ�.
�������� ����մϴ�.
*/