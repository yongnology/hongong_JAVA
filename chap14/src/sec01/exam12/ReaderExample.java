package sec01.exam12;
// �迭 ���̸�ŭ �б�
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test8.txt");
		// ������ ������� hongong_test8�� �ϴ� ���� ��� ���� �Է� ��Ʈ�� ����
		
		char[] buffer = new char[100];	// ���� 100�� �迭 ����
		
		while(true) {
			int readCharNum = reader.read(buffer);
			// �迭 ���̸�ŭ �б�
			if(readCharNum == -1) break;
			// ���� ���� �������� ��� -1 ����ϴµ�, �׶� break;
			for(int i=0; i<readCharNum; i++) {
				System.out.println(buffer[i]);
				// ���� ���� ����ŭ �ݺ��ϸ鼭 �迭�� ����� ���ڸ� ���
				
			}
		}
		reader.close();
		// �Է� ��Ʈ���� ����
	}
}
/* ��°�
A
B
C
*/