package sec02.exam04;
// ���� �ٺ��ؼ� ����ϴ� ������
public class PrintThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("���� ��");
			if(Thread.interrupted()) {
				break;	// while�� ��������
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
