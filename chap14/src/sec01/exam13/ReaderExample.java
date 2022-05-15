package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test9.txt");
		// ������ ������� hongong_test9�� �ϴ� ���� ��� ���� �Է� ��Ʈ���� ����
		
		char[] buffer = new char[5];
		
		int readCharNum = reader.read(buffer,2,3);
		// �Է� ��Ʈ�����κ��� 3���� ���ڸ� �а�
		//buffer[2], buffer[3], buffer[4]�� ���� ����
		
		if(readCharNum != -1) {
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
		// �Է� ��Ʈ���� ����
	}
}
/* ��°�
B
C
D
*/