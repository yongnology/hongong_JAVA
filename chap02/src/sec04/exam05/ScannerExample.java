package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� : \"" + inputData + "\"");
			if(inputData.equals("q")) {	// ���ڿ�(String)�̱� ������ == ��� equals()�޼ҵ� ���.
				break;
			}
		}
		System.out.println("����");
	}
}
/* ��°�
a
�Էµ� ���ڿ� : "a"
abc
�Էµ� ���ڿ� : "abc"
����
�Էµ� ���ڿ� : "����"
q
�Էµ� ���ڿ� : "q"
����
*/