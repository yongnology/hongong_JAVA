package sec03.exam03;

public class ByteOperationExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;		// 변수에 있는 값이 아니므로 byte로 가능
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x+y;	// 변수에 대해 합은 int타입을 써줘야 한다.
		System.out.println(result2);
	}
}
/* 출력값
30
30
*/