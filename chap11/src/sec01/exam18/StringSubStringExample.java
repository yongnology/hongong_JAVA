package sec01.exam18;
// 문자열 추출하기
public class StringSubStringExample {

	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		// 0번째 부터 6번째까지
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
}
/* 출력값
880815
1234567
*/