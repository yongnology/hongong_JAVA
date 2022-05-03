package sec02.question;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqul DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySqul DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySqul DB를 수정");		
	}

	@Override
	public void delete() {
		System.out.println("MySqul DB에서 삭제");		
	}
	
}
