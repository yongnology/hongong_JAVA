package sec01.exam24;
// 문자열을 기본 타입 값으로 변환
public class StringToPrivitiveValueExample {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10");
					// 문자가 int타입으로
		double value2 = Double.parseDouble("3.14");
					//문자가 double 타입으로
		boolean value3 = Boolean.parseBoolean("true");
					// 문자가 boolean타입으로
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}
}
/* 출력값
value1 : 10
value2 : 3.14
value3 : true
*/