package sec01.exam06;
// 메인 스레드 이름 출력 및 userThread 생성 및 시작
public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : "+ mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		threadB.start();
	}

}
/* 출력값
프로그램 시작 스레드 이름 : main
작업 스레드 이름 : ThreadA
ThreadA가 출력한 내용
ThreadA가 출력한 내용
작업 스레드 이름 : Thread-1
Thread-1가 출력한 내용
Thread-1가 출력한 내용
*/