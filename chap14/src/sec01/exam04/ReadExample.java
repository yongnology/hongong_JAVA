package sec01.exam04;
// 1byte씩 읽기
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/hongong_test1.db");
		// 데이터 출발지를 hongong_test1.db로 하는 바일 기반 파일 입력 스트림을 생성
		while(true) {
			int data = is.read();	// 1byte씩 읽기
			if(data == -1) break;	// 파일 끝에 도달했을 경우
			System.out.println(data);
		}
		is.close();	// 입력 스트림을 닫음
	}

}
/* 출력값
10
20
30
*/