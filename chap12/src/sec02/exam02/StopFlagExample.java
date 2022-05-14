package sec02.exam02;
// 1초 후 출력 스레드를 중지
import java.awt.Toolkit;

// 1초 후 출력 스레드를 중지
public class StopFlagExample {

	public static void main(String[] args) {
		PrintThread1 printThread = new PrintThread1();
		printThread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		printThread.setStop(true);
	}

}
/* 출력값
실행 중
실행 중
실행 중
···(1초동안 계속 반복 후)
자원정리
실행 종료
*/