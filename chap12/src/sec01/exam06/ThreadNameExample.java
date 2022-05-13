package sec01.exam06;
// ���� ������ �̸� ��� �� userThread ���� �� ����
public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		threadB.start();
	}

}
/* ��°�
���α׷� ���� ������ �̸� : main
�۾� ������ �̸� : ThreadA
ThreadA�� ����� ����
ThreadA�� ����� ����
�۾� ������ �̸� : Thread-1
Thread-1�� ����� ����
Thread-1�� ����� ����
*/