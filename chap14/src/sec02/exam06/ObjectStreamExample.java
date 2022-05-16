package sec02.exam06;
// 객체 입출력 보조 스트림
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 객체 입출력 보조 스트림
public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();	// List를 파일에 저장
		List<Board> list = readList();	// 파일에 저장된 List 읽기
		
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
		List<Board> list = new ArrayList<>();	// List 생성
		
		list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();
		}
		
		public static List<Board> readList() throws Exception{
			// 객체 입력 스트림을 이용해서 list 읽기
			FileInputStream fis = new FileInputStream("C:/Temp/board.db");
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Board> list = (List<Board>) ois.readObject();
			return list;
		}
	}
/* 출력
1	제목1	내용1	글쓴이1	2022-05-16
2	제목2	내용2	글쓴이2	2022-05-16
3	제목3	내용3	글쓴이3	2022-05-16
*/