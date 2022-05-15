package sec01.exam11;
// 한 문자씩 읽기
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test7.txt");
		// 데이터 출발지를 hongong_test7로 하는 문자 기반 입력 스트림을 생성
		while(true) {
			int data = reader.read();	// 한 문자씩 읽기
			if(data == -1) break;		// 파일 끝에 도달했을 경우
			System.out.println((char)data);
		}
		reader.close();
	}
}
/* 출력값
A
B
C
*/