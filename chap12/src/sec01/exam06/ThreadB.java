package sec01.exam06;
// ThreadB Ŭ����
public class ThreadB extends Thread{
	// ThreadB ���� ����
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}
