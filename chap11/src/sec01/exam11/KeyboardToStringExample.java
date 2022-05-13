package sec01.exam11;
// 바이트 배열을 문자열로 변환
import java.io.*;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		// 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
			// read() 메소드는 IOException 발생할 수 있어 예외처리를 해야 한다.
		// 배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		String str = new String(bytes, 0, readByteNo-2);
			// 입력받기 위한 엔터는 2개의 byte이다. 따라서 -2를 해준다.
		// 배열을 문자로 변환
		
		System.out.println(str);
	}

}
/* 출력값
입력 : 자바는 String 클래스를 제공합니다.
자바는 String 클래스를 제공합니다.
*/