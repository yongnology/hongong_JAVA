package sec01.exam15;
// 문자열 포함 조사
public class StringIndexExample {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		// 문자열 포함 찾기 방법 1) indexOf()
		if(subject.indexOf("자바") != -1) {
			// -1을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
		
		// 문자열 포함 찾기 방법 2) contains()
		if(subject.contains("자바")) {
			// -1을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련없는 책이군요");
		}
	}
}
/* 출력값
3
자바와 관련된 책이군요
*/