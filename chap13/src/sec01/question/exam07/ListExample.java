package sec01.question.exam07;

import java.util.List;

// BoardDao ��� Ŭ����
public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}
}
/* ��°�
����1-����1
����2-����2
����3-����3
*/