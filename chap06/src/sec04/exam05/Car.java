package sec04.exam05;
// Ŭ���� �ܺο��� �޼ҵ� ȣ��
public class Car {
	// �ʵ�(field)
	int speed;
	
	// ������(Constructor)
	
	// �޼ҵ�(Method)
	int getSpeed() {
		return speed;
	}
	
	void keyTrunOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("�޸��ϴ�.(�ü�:"+ speed + "km/h)");
		}
	}
}
