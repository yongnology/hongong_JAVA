package sec01.exam08;
// �迭 ��ü�� ����ϱ�
import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/hongong_test8.txt");
		// ������ �������� hongong_test8�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array= {'A', 'B', 'C', };
		
		writer.write(array);	// �迭�� ��� ���ڸ� ���
		
		writer.flush();		// ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close();		// ��� ��Ʈ���� ����
		
	}

}
/* Temp������
hongong_test9.txt ������ �����
���� ������
ABC
*/