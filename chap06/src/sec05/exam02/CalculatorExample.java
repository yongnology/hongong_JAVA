package sec05.exam02;
// ���� ��� ���
public class CalculatorExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;	// CalculateŬ������.pi �޼ҵ带 ����Ѵ�!
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}
}
/* ��°�
result1 : 314.159
result2 : 15
result3 : 5
*/