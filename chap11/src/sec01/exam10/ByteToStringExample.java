package sec01.exam10;
// ����Ʈ �迭�� ���ڿ��� ��ȯ
public class ByteToStringExample {

	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);	// �������� �Ű������� bytes
		System.out.println(str1);	//������ bytes �� ���ڿ��� �ٲ㼭 ���
		
		String str2 = new String(bytes, 6, 4);
							// Index 0���� ������ "6" ���� 4���� ���ڿ�
		System.out.println(str2);
	}
}
/* ��°�
Hello Java
Java
*/