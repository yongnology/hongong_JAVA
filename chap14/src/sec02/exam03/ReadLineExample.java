package sec02.exam03;
// ���� ������ ���ڿ� �б�
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception {
		// �ܼ� ��� �Է� ��Ʈ�� ���
		Reader reader = new FileReader(
			ReadLineExample.class.getResource("lanuage.txt").getPath()
		);
		BufferedReader br = new BufferedReader(reader);
		// BufferReader ���� ��Ʈ�� ����
		
		while(true) {
			String data = br.readLine();	// ���� ���� ���ڿ��� �а� ����
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();		// �Է� ��Ʈ�� �ݱ�
	}

}
/* ��°�
sec02.exam03;

C ���
Java ���
Python ���
*/