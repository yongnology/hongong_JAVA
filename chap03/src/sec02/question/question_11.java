package sec02.question;

import java.util.Scanner;

public class question_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String name = scanner.nextLine();
		
		System.out.print("�н����� : ");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}
	}
}
/* ��°�
���̵� : java
�н����� : 
12345
�α��� ����
*/