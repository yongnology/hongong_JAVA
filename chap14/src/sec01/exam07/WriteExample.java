package sec01.exam07;
// �� ���ھ� ����ϱ�
import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		
		Writer writer = new FileWriter("C:/Temp/hongong_test7.txt");
		// ������ �������� hongong_test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();// ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close();// ��� ��Ʈ���� ����
	}

}
/* ��°�
Temp������
hongong_test7.txt ���� ����.
���ϳ��� ABC
*/