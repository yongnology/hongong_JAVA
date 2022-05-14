package sec02.question.exam03;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		thread.interrupt();
		
	}

}
/* 출력값
동영상을 재생합니다.
(1초동안 출력)
*/