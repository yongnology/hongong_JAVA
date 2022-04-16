package sec04.question;

import java.util.Scanner;

public class Question_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리 : ");
		String jumin = scanner.nextLine();
		System.out.println("3. 전화번호 : ");
		String tel = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(jumin);
		System.out.println(tel);
	}
}
/* 출력값
[필수 정보 입력]
1. 이름 : 이용민
2. 주민번호 앞 6자리 : 123456
3. 전화번호 : 
010-123-1234
[입력한 내용]
이용민
123456
010-123-1234
*/