package sec03.exam03;
// �������� �����ε�
public class Car {
	// �ʵ�(field)
	String company = "�����ڵ���";
	String model;	// null �� ����Ʈ�� �ʱ�ȭ
	String color;	// null �� ����Ʈ�� �ʱ�ȭ
	int maxSpeed;	// 0 ���� ����Ƽ�� �ʱ�ȭ
	
	// ������(Constructor)
	// 1) ������
	Car() {
		
	}
	// 2) ������
	Car(String model) {
		this.model = model;
	}
	// 3) ������
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	// 4) ������
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
