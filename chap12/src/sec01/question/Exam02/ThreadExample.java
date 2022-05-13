package sec01.question.Exam02;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(
				new MusicRunnable());
		thread2.start();
	}
}
/* 출력값
동영상을 재생합니다.
음악을 재생합니다.
동영상을 재생합니다.
음악을 재생합니다.
음악을 재생합니다.
동영상을 재생합니다.
*/