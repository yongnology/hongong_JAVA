package sec04.question;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸� : ");
		String name = scanner.nextLine();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ� : ");
		String jumin = scanner.nextLine();
		System.out.println("3. ��ȭ��ȣ : ");
		String tel = scanner.nextLine();
		
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(jumin);
		System.out.println(tel);
	}
}
/* ��°�
[�ʼ� ���� �Է�]
1. �̸� : �̿��
2. �ֹι�ȣ �� 6�ڸ� : 123456
3. ��ȭ��ȣ : 
010-123-1234
[�Է��� ����]
�̿��
123456
010-123-1234
*/