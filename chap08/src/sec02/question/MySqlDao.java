package sec02.question;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySqul DB���� �˻�");
	}

	@Override
	public void insert() {
		System.out.println("MySqul DB�� ����");
	}

	@Override
	public void update() {
		System.out.println("MySqul DB�� ����");		
	}

	@Override
	public void delete() {
		System.out.println("MySqul DB���� ����");		
	}
	
}
