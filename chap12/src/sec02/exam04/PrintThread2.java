package sec02.exam04;
// 무한 바복해서 출력하는 스레드
public class PrintThread2 extends Thread{
	public void run() {
		while(true) {
			System.out.println("실행 중");
			if(Thread.interrupted()) {
				break;	// while문 빠져나옴
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
