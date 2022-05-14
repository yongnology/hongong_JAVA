package sec02.exam03;
// 1초 후 출력 스레드를 중지
public class InterruptExample {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {Thread.sleep(1);
		} catch(InterruptedException e) {}
		
		thread.interrupt();
		// 스레드를 종료하기 위해 InterruptedException을 발생시킴
	}
}
/* 출력값
실행중
실행중
자원 정리
실행 종료
*/