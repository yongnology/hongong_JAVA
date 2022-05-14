package sec02.question.exam04;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread = new MovieThread();
		
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
}
/* 출력값
동영상을 재생합니다.
동영상을 재생합니다.
동영상을 재생합니다.
(3초동안 출력 후 종료)
*/