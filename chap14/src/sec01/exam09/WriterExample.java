package sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/hongong_test9.txt");
		// ������ �������� hongong_test9�� �ϴ� ���� ��� ���� ��� ��Ʈ���� ����
		
		char[] array = {'A', 'B', 'C', 'D', 'E'};
		
		writer.write(array, 1,3);	// �迭�� 1�� �ε��� ���� 3�� ���
		
		writer.flush();		// ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close();		// ��� ��Ʈ���� ����
		
	}

}
/* Temp������
hongong_test9.txt ������ �����
���� ������
BCD
*/