package sec02.exam03;
// 라인 단위로 문자열 읽기
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		// 콘솔 기반 입력 스트림 얻기
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("lanuage.txt").getPath()
		);
		BufferedReader br = new BufferedReader(reader);
		// BufferReader 보조 스트림 연결
		
		while(true) {
			String data = br.readLine();	// 라인 단위 문자열을 읽고 리턴
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();		// 입력 스트림 닫기
	}

}
/* 출력값
sec02.exam03;

C 언어
Java 언어
Python 언어
*/