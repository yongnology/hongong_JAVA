package sec01.exam05;
// �迭 ���̸�ŭ �б�
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/hongong_test2.db");
		// ������ ������� hongong_test2.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� ����
		
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer);
			// �迭�� ���̸�ŭ(100) �б�
			
			if(readByteNum == -1) break;
			// ���� ���� �������� ���
			
			for(int i= 0; i<readByteNum; i++) {
				System.out.println(buffer[i]);
				// ���� ����Ʈ ����ŭ �����ϸ鼭 �迭�� ����� ����Ʈ ���
			}
		}
		is.close();
		// �Է� ��Ʈ���� ����
	}

}
/* ��°�
10
20
30
*/