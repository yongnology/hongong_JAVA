package sec01.exam17;
// 문자열 대치하기
// replace() 메소드는 문자열 대치 후 새로운 문자열을 생성한다. 즉 수정본(X) 
public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
/* 출력값
자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.
JAVA는 객체 지향 언어입니다. JAVA는 풍부한 API를 지원합니다.
*/