package sec01.exam02;
//�迭 ��ü�� ����ϱ�
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/hongong_test2.db");
		// ������ �������� hongong_test2.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ���� ����
		
		byte[] array = { 10, 20, 30 };
		
		os.write(array);	// �迭 ��� ����Ʈ�� ���
		
		os.flush();	// ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close();	// ��� ��Ʈ���� ����
	}

}
