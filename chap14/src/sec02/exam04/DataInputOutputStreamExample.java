package sec02.exam04;
// �⺻ Ÿ�� �����
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// ����Ʈ ��� ��� ��Ʈ���� �����ϰ�, DataOutputStream ���� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		// �⺻ Ÿ�� �� ���
		dos.writeUTF("ȫ�浿");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("���ڹ�");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.flush();
		dos.close();	// ��� ��Ʈ�� �ݱ�
		
		// ����Ʈ ��� �Է� ��Ʈ���� �����ϰ� DataInputStream ���� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		dis.close();
		// �Է� ��Ʈ�� �ݱ�
	}
}
/* ��°�
// ����
Temp ������ privitive.db ����
// ��°�
ȫ�浿 : 95.5 : 1
���ڹ� : 90.3 : 2
*/