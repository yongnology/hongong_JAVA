package sec02.exam01;
//3초 주기로 10번 비프음 발생
import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
				// 3초 동안 메인 스레드를 일시 정지 상태로 만듬
			} catch (InterruptedException e) {

			}
		}
	}

}
// 3초 주기로 비프(beep음을 10번 발생)