package sec01.exam08;
// ���� �����尡 �����ϴ� �ڵ�
public class MainThreadExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();	// �޸𸮿� 100�� ����
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();	// �޸𸮿� 50�� ����
	}
}
/* ��°�
User1: 100
User2: 50
*/