package sec01.exam01;
// 1byte�� ����ϱ�
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriterExample {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/hongong_test1.db");
		// ������ �������� hongong_test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte�� ���
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();		// ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();		// ��� ��Ʈ���� ����
		
	}
}
/* ��°�
C:/Temp/ ������
hongong_test1
���� ����
*/