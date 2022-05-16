package sec02.exam01;
// ���� ��ȯ ���� ��Ʈ��
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		Writer("���� ��ȯ ��Ʈ���� ����մϴ�.");	// �� �����Է�
		String data = read();
		System.out.println(data);
	}

	private static void Writer(String str) throws Exception{
		// FileOutputStream�� OutputStreamWriter ���� ��Ʈ���� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/hongong_test1.txt");
		Writer writer = new OutputStreamWriter(fos);
		writer.write(str);
		// OutputStreamWriter ���� ��Ʈ���� �̿��ؼ� ���� ���
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception {
		// FileInputStream�� InputStreamReader ���� ��Ʈ���� ����
		FileInputStream fis = new FileInputStream("C:/Temp/hongong_test1.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		// ��InputStreamReader ���� ��Ʈ���� �̿��ؼ� ���� �Է�
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}
}
/* Temp ���� �ȿ� hongong_test.txt ���� ����
���� : ���� ��ȯ ��Ʈ���� ����մϴ�.
���� Temp���� �� hongong_test1.txt�� �ҷ��� ����
*/