package sec01.exam11;
// �� ���ھ� �б�
import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/hongong_test7.txt");
		// ������ ������� hongong_test7�� �ϴ� ���� ��� �Է� ��Ʈ���� ����
		while(true) {
			int data = reader.read();	// �� ���ھ� �б�
			if(data == -1) break;		// ���� ���� �������� ���
			System.out.println((char)data);
		}
		reader.close();
	}
}
/* ��°�
A
B
C
*/