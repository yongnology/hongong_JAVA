package sec02.question;

import java.util.Scanner;

public class Question_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		double firstNum = Double.parseDouble(scanner.nextLine());
		
		System.out.print("�� ���� �� : ");
		double secondNum = Double.parseDouble(scanner.nextLine());
		
		System.out.println("----------------");
		if(secondNum != 0.0) {
		System.out.println("��� : " + firstNum/secondNum);
		} else {
			System.out.println("��� : ���Ѵ�");
		}
	}
}
/* ��°�
ù ��° �� : 7.3
�� ���� �� : 2.5
----------------
��� : 2.92
*/