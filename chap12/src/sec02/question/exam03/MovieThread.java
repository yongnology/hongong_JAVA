package sec02.question.exam03;

public class MovieThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("�������� ����մϴ�.");
			if(this.isInterrupted()) {
				break;
			}
		}
	}
}
