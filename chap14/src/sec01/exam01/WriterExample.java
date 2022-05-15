package sec01.exam01;
// 1byte씩 출력하기
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/hongong_test1.db");
		// 데이터 도착지를 hongong_test1.db로 하는 바이트 기반 파일 출력 스트림을 생성
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();		// 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();		// 출력 스트림을 닫음
		
	}
}
/* 출력값
C:/Temp/ 폴더에
hongong_test1
파일 생성
*/