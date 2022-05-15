package sec01.exam12;
// 배열 길이만큼 읽기
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test8.txt");
		// 데이터 출발지를 hongong_test8로 하는 문자 기반 파일 입력 스트림 생성
		
		char[] buffer = new char[100];	// 길이 100인 배열 생성
		
		while(true) {
			int readCharNum = reader.read(buffer);
			// 배열 길이만큼 읽기
			if(readCharNum == -1) break;
			// 파일 끝에 도달했을 경우 -1 출력하는데, 그때 break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
				// 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
				
			}
		}
		reader.close();
		// 입력 스트림을 닫음
	}
}
/* 출력값
A
B
C
*/