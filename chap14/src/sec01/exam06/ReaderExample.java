package sec01.exam06;
// ������ ���̸�ŭ �б�
import java.io.FileInputStream;
import java.io.InputStream;

public class ReaderExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/hongong_test3.db");
		// ������ ������� hongong_test3.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� ����
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer, 2,3);
		// �Է� ��Ʈ�����κ��� 3byte�� �а� buffer[2], buffer[3], buffer[4]�� ���� ����
		
		if(readByteNum != -1) {	// ���� ����Ʈ�� �ִٸ�
			// �迭 ��ü�� �а� ���			
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
	}

}
/* ��°�
0
0
20
30
40
*/