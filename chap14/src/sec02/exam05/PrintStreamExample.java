package sec02.exam05;
// ���� ������ ����ϱ�
import java.io.FileOutputStream;
import java.io.PrintStream;
//import java.util.Scanner;	// ���Ƿ� �߰�

public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/printStream.txt");
		PrintStream ps = new PrintStream(fos);
		
		//Scanner sc = new Scanner(System.in);	// ���Ƿ� �߰�
		//String a = sc.nextLine();				// ���Ƿ� �߰�
		
		ps.println("[������ ���� ��Ʈ��]");
		ps.print("��ġ ");
		ps.println("����Ʈ�� ����ϴ� ��ó��");
		ps.println("�����͸� ����մϴ�.");
		//ps.println(a);	// ���Ƿ� �߰�
		
		ps.flush();
		ps.close();
		
	}

}
/* ��°�
// ����
Temp ������ printStream.txt ������ ������
// ����
[������ ���� ��Ʈ��]
��ġ ����Ʈ�� ����ϴ� ��ó��
�����͸� ����մϴ�.
*/