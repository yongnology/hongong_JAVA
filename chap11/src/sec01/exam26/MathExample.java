package sec01.exam26;
// Math의 수학 메소드
public class MathExample {

	public static void main(String[] args) {
		// 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		// 올림값
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		// 버림값
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.23, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.23, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		// 랜덤값
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		// 가까운 정수의 실수값
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		// 반올림값
		long v14 = Math.round(5.3);
		long v15 = Math.round(5.7);
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		// 활용
		double value = 12.3456;
		double temp1 = value * 100;
		double temp2 = Math.round(temp1);
		double v16 = temp2/100.0;
		System.out.println("v16 = " + v16);
	}
}
/* 출력값
v1 = 5
v2 = 3.14
v3 = 6.0
v4 = -5.0
v5 = 5.0
v6 = -6.0
v7 = 9
v8 = 5.23
v9 = 5
v10 = 2.5
v11 = 0.7407602907913532
v12 = 5.0
v13 = 6.0
v14 = 5
v15 = 6
v16 = 12.35
*/