package sec01.exam03;
// �迭 �Ϻθ� ����ϱ�
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/hongong_test3.db");
		// ������ �������� hongong_test3.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte[] array = { 10, 20, 30, 40, 50};
		
		os.write(array, 1, 3);
		// �迭�� 1�� �ε������� 3���� ���
		
		os.flush();	// ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();	// ��� ��Ʈ���� ����
		
	}
}
