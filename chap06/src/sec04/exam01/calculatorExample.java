package sec04.exam01;
// 메소드 호출
public class calculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
	}

}
/* 출력값
전원을 켭니다.
result : 11
result2 : 2.5
전원을 끕니다.
*/