package sec01.exam06;
// ThreadA Ŭ����
public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
		// ������ �̸� ����
	}
	
	public void run() {
		// ThreadA ���� ����
		for(int i=0; i<2; i++) {
			System.out.println(getName() +"�� ����� ����");
			// getName() = ������ �̸� ���
		}
	}
}
