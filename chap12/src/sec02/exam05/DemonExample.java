package sec02.exam05;
// 메인 스레드가 실행하는 코드
public class DemonExample {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
	}

}
/* 출력값
(1초후)
작업 내용을 저장함
(1초후)
작업 내용을 저장함
(1초후)
메인 스레드 종료
*/