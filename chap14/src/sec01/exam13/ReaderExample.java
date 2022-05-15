package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test9.txt");
		// 데이터 출발지를 hongong_test9로 하는 문자 기반 파일 입력 스트림을 생성
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer,2,3);
		// 입력 스트림으로부터 3개의 문자를 읽고
		//buffer[2], buffer[3], buffer[4]에 각각 저장
		
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
		// 입력 스트림을 닫음
	}
}
/* 출력값
B
C
D
*/