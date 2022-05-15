package sec01.exam07;
// 한 문자씩 출력하기
import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("C:/Temp/hongong_test7.txt");
		// 데이터 도착지를 hongong_test7.txt로 하는 문자 기반 파일 출력 스트림 생성
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();// 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close();// 출력 스트림을 닫음
	}

}
/* 출력값
Temp폴더에
hongong_test7.txt 파일 생성.
파일내용 ABC
*/