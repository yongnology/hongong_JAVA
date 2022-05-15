package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/hongong_test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		// 문자열 전체를 출력
		
		writer.flush();
		writer.close();
	}

}
/* 출력값
Temp폴더에
hongong_test10.txt 파일이 생기고
파일 내용은
ABC
*/