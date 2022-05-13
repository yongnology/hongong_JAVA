package sec01.exam06;
// ThreadA 클래스
public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
		// 스레드 이름 설정
	}
	
	public void run() {
		// ThreadA 실행 내용
		for(int i=0; i<2; i++) {
			System.out.println(getName() +"가 출력한 내용");
			// getName() = 스레드 이름 얻기
		}
	}
}
