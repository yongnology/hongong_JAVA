package sec02.exam06;
// ��ü ����� ���� ��Ʈ��
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// ��ü ����� ���� ��Ʈ��
public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();	// List�� ���Ͽ� ����
		List<Board> list = readList();	// ���Ͽ� ����� List �б�
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + 
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception {
		List<Board> list = new ArrayList<>();	// List ����
		
		list.add(new Board(1, "����1", "����1", "�۾���1", new Date()));
		list.add(new Board(2, "����2", "����2", "�۾���2", new Date()));
		list.add(new Board(3, "����3", "����3", "�۾���3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
		}
		
		public static List<Board> readList() throws Exception{
			// ��ü �Է� ��Ʈ���� �̿��ؼ� list �б�
			FileInputStream fis = new FileInputStream("C:/Temp/board.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Board> list = (List<Board>) ois.readObject();
			return list;
		}
	}
/* ���
1	����1	����1	�۾���1	2022-05-16
2	����2	����2	�۾���2	2022-05-16
3	����3	����3	�۾���3	2022-05-16
*/