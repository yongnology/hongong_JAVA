package sec01.exam06;
// 지정한 길이만큼 읽기
import java.io.FileInputStream;
import java.io.InputStream;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/hongong_test3.db");
		// 데이터 출발지를 hongong_test3.db로 하는 바이트 기반 파일 입력 스트림을 생성
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2,3);
		// 입력 스트림으로부터 3byte를 읽고 buffer[2], buffer[3], buffer[4]에 각각 저장
		
		if(readByteNum != -1) {	// 읽은 바이트가 있다면
			// 배열 전체를 읽고 출력			
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
/* 출력값
0
0
20
30
40
*/