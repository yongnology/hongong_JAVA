package sec03.exam01;
// Ű����κ��� ���� ���� ���ڿ� ���
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class GetLineStringFromKeyboard {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("�Է��ϼ��� : ");
			String lineStr = br.readLine();
				// ���� ������ ���ڿ��� ����
			if(lineStr.equals("q") || lineStr.equals("quit")) break;
				// q �Ǵ� quit�� �о��� �� while �ݺ��� ����
			System.out.println("�Է��� ���� : " + lineStr);
			System.out.println();
		}
		br. close();
	}
}
/* ��°�
�Է��ϼ��� : System.in
�Է��� ���� : System.in

�Է��ϼ��� : 12345 ,()_+=$# ����
�Է��� ���� : 12345 ,()_+=$# ����

�Է��ϼ��� : q
*/