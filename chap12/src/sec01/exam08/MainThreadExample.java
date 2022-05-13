package sec01.exam08;
// 메인 스레드가 실행하는 코드
public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();	// 메모리에 100을 저장
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();	// 메모리에 50을 저장
	}
}
/* 출력값
User1: 100
User2: 50
*/