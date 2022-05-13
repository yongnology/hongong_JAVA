package sec01.exam19;
// 전부 소문자 또는 대문자로 변경
public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		// 대소문자 구분없이 문자열 자체만을 구분 : equalsIgnoreCase() 메소드
	}

}
/* 출력값
false
true
true
*/