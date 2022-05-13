package sec01.exam22;
// 기본 타입의 값을 박싱하고 언박싱하기
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		// 현재 자바9버전 이후는 Integer가 deprecated 표시가 뜬다.
		// deprecated : 더이상 사용하지 않을 키워드라는 의미
		Integer obj3 = Integer.valueOf("300");
		
		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}
}
/* 출력값
100
200
300
*/