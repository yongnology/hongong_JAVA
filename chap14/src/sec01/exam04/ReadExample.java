package sec01.exam04;
// 1byte�� �б�
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("C:/Temp/hongong_test1.db");
		// ������ ������� hongong_test1.db�� �ϴ� ���� ��� ���� �Է� ��Ʈ���� ����
		while(true) {
			int data = is.read();	// 1byte�� �б�
			if(data == -1) break;	// ���� ���� �������� ���
			System.out.println(data);
		}
		is.close();	// �Է� ��Ʈ���� ����
	}

}
/* ��°�
10
20
30
*/