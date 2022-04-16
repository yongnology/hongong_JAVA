package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if(inputData.equals("q")) {	// 문자열(String)이기 때문에 == 대신 equals()메소드 사용.
				break;
			}
		}
		System.out.println("종료");
	}
}
/* 출력값
a
입력된 문자열 : "a"
abc
입력된 문자열 : "abc"
언어다
입력된 문자열 : "언어다"
q
입력된 문자열 : "q"
종료
*/