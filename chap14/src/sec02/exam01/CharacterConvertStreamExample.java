package sec02.exam01;
// 문자 변환 보조 스트림
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		Writer("문자 변환 스트림을 사용합니다.");	// 쓸 내용입력
		String data = read();
		System.out.println(data);
	}

	private static void Writer(String str) throws Exception{
		// FileOutputStream에 OutputStreamWriter 보조 스트림을 연결
		FileOutputStream fos = new FileOutputStream("C:/Temp/hongong_test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		// OutputStreamWriter 보조 스트림을 이용해서 문자 출력
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		// FileInputStream에 InputStreamReader 보조 스트림을 연결
		FileInputStream fis = new FileInputStream("C:/Temp/hongong_test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		// ㅑInputStreamReader 보조 스트림을 이용해서 문자 입력
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
/* Temp 폴더 안에 hongong_test.txt 파일 저장
내용 : 문자 변환 스트림을 사용합니다.
이후 Temp폴더 안 hongong_test1.txt를 불러와 읽음
*/