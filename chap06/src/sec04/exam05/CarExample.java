package sec04.exam05;
// Ŭ���� �ܺο��� �޼ҵ� ȣ��
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.keyTrunOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("���� �ӵ� : " + speed + "km/h)");
	}
}
/* ��°�
Ű�� �����ϴ�.
�޸��ϴ�.(�ü�:10km/h)
�޸��ϴ�.(�ü�:20km/h)
�޸��ϴ�.(�ü�:30km/h)
�޸��ϴ�.(�ü�:40km/h)
�޸��ϴ�.(�ü�:50km/h)
���� �ӵ� : 50km/h)
*/