package sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/hongong_test10.txt");
		
		String str = "ABC";
		
		writer.write(str);
		// ���ڿ� ��ü�� ���
		
		writer.flush();
		writer.close();
	}

}
/* ��°�
Temp������
hongong_test10.txt ������ �����
���� ������
ABC
*/