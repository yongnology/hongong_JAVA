package sec01.exam11;
// ����Ʈ �迭�� ���ڿ��� ��ȯ
import java.io.*;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		// ���� ����Ʈ�� �����ϱ� ���� �迭 ����
		
		System.out.print("�Է� : ");
		int readByteNo = System.in.read(bytes);
			// read() �޼ҵ�� IOException �߻��� �� �־� ����ó���� �ؾ� �Ѵ�.
		// �迭�� ���� ����Ʈ�� �����ϰ� ���� ����Ʈ ���� ����
		
		String str = new String(bytes, 0, readByteNo-2);
			// �Է¹ޱ� ���� ���ʹ� 2���� byte�̴�. ���� -2�� ���ش�.
		// �迭�� ���ڷ� ��ȯ
		
		System.out.println(str);
	}

}
/* ��°�
�Է� : �ڹٴ� String Ŭ������ �����մϴ�.
�ڹٴ� String Ŭ������ �����մϴ�.
*/