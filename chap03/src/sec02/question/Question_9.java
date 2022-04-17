package sec02.question;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		double firstNum = Double.parseDouble(scanner.nextLine());
		
		System.out.print("두 번쨰 수 : ");
		double secondNum = Double.parseDouble(scanner.nextLine());
		
		System.out.println("----------------");
		if(secondNum != 0.0) {
		System.out.println("결과 : " + firstNum/secondNum);
		} else {
			System.out.println("결과 : 무한대");
		}
	}
}
/* 출력값
첫 번째 수 : 7.3
두 번쨰 수 : 2.5
----------------
결과 : 2.92
*/