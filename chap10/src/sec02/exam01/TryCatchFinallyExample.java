package sec02.exam01;
// 일반 예외 처리
public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		try {	// 예외 예상 구역
			Class clazz = Class.forName("java.lang.String2");
			System.out.println("정상실행");
			
			// 예외가 발생한다면 실행
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
/* 출력값
클래스가 존재하지 않습니다.
*/