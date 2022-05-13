package sec01.exam23;
// 자동 박싱과 언박싱
public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// 자동 박싱
		Integer obj = 100;
		// 100기본값을 Integer객체로 포장을 해서 obj에 대입
		System.out.println("value : " + obj.intValue());
		
		// 대입 시 자동 언박싱
		int value = obj;	// 기본타입 변수에 참조타입 변수 대입(원래는 맞지 않다)
		// obj가 자동 언박싱되어 기본타입으로 저장된다.
		System.out.println("value : " + value);
		
		// 연산 시 자동 언박싱
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
/* 출력값
value : 100
value : 100
result : 200
*/