package sec01.exam03;
// 메소드 재정의 테스트
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCricle(r));
		System.out.println();	// 기본 부모 메소드를 가져와서 출력
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCricle(r));
								// 재정의된 메소드로 출력
	}
}
/* 출력값
Calculator 객체의 areaCircle() 실행
원면적 : 314.159

Computer 객체의 areaCircle() 실행
원면적 : 314.1592653589793
*/