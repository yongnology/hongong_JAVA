package sec01.question.exam07;

import java.util.List;

// BoardDao 사용 클래스
public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
/* 출력값
제목1-내용1
제목2-내용2
제목3-내용3
*/