package sec05.exam03;
// ���� �޼ҵ� ����� ������ ��
public class Car {
	int speed;
	
	void run() {
		System.out.println(speed+"���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;	// �ٷ� ����� �� ��� .speed�� ��Ʈ �����ڷ� ����
		myCar.run();		// �ٷ� ����� �� ��� .speed�� ��Ʈ �����ڷ� ����
	}
}
/* ��°�
60���� �޸��ϴ�.
*/