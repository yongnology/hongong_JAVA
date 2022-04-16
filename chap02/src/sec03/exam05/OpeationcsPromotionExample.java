package sec03.exam05;

public class OpeationcsPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//컴파일 에러. int를 사용해야한다.
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2; 	// 컴파일 에러 int를 사용해야한다.
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);		//소수점 삭제
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0;		//컴파일 에러. double을 사용해야 한다.
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
	}
}
/* 출력값
30
유니코드 = 66
출력문자 = B
2
2.5
0.5
*/