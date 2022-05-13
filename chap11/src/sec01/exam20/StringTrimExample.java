package sec01.exam20;
// 문자열 앞뒤 공백 제거
public class StringTrimExample {
	
	public static void main(String[] args) {
		
		String tel1 = "  02";
		String tel2 = "123  ";
		String tel3 = "    1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		// 앞 뒤 공백을 제거한 문자열을 생성한다. 단 중간의 공백은 제거하지 않는다.
		System.out.println(tel);
	}
}

/* 출력값
021231234
*/