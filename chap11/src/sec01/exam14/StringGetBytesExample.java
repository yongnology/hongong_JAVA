package sec01.exam14;
// ����Ʈ �迭�� ��ȯ
import java.io.*;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���";
		
		// �⺻ ���ڼ����� ���ڵ��� ���ڵ�
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		
		String str1 = new String(bytes1);
		System.out.println("bytes1-> String : " + str1);
		
		try {
			// EUC-KR�� �̿��ؼ� ���ڵ� �� ���ڵ�
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2-> String : " + str2);
			
			// UTF-8�� �̿��ؼ� ���ڵ� �� ���ڵ�
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3-> String : " + str3);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
/* ��°�
bytes1.length: 10
bytes1-> String : �ȳ��ϼ���
bytes2.length: 10
bytes2-> String : �ȳ��ϼ���
bytes3.length: 15
bytes3-> String : �ȳ��ϼ���
*/