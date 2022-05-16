package sec03.exam03;
// File Ŭ������ �̿��� ���� �� ���� ���� ���
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception{
		// File ��ü ����
		File dir = new File("C:/Temp/hongong/images");
		File file1 = new File("C:/Temp/hongong/file1.txt");
		File file2 = new File("C:/Temp/hongong/file2.txt");
		File file3 = new File("C:/Temp/hongong/file3.txt");
		
		// ���� �Ǵ� ������ �������� ������ ����
		// ���� ����
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		// ���� ����
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		
		// C:/Temp ������ ���� ����� FIle �迭�� ����
		File temp = new File("C:/Temp/hongong/");
		File[] contents = temp.listFiles();
		
		System.out.println("�ð�\t\t\t����\t\tũ��\t�̸�");
		System.out.println("---------------------------------------------------------");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.print("\t<DIR>\t\t\t" + file.getName());
			} else {
				System.out.print("\t\t\t" + file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
	}

}
/* ��°�
// ����
Temp/hongong ���� �ȿ�
file1.txt 
file2.txt
file3.txt���� ����
images ��������

// ��°�
�ð�			����		ũ��	�̸�
---------------------------------------------------------
2022-05-16 ���� 22:24			382	board.db
2022-05-17 ���� 00:27			0	file1.txt
2022-05-17 ���� 00:27			0	file2.txt
2022-05-17 ���� 00:27			0	file3.txt
2022-05-17 ���� 00:27	<DIR>			images

*/