package sec01.exam10;
// 바이트 배열을 문자열로 변환
public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);	// 생성자의 매개값으로 bytes
		System.out.println(str1);	//각각의 bytes 를 문자열로 바꿔서 출력
		
		String str2 = new String(bytes, 6, 4);
							// Index 0부터 시작한 "6" 부터 4개의 문자열
		System.out.println(str2);
	}
}
/* 출력값
Hello Java
Java
*/