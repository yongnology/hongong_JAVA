package sec02.exam01;
// �ܺ� Ŭ�������� Car �ʵ尪 �б�� ����
public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		// �ʵ尪 �б�
		System.out.println("���� ȸ�� : "+ myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ �ӵ� : " + myCar.speed);
	}

}
/* ��°�
���� ȸ�� : �����ڵ���
�𵨸� : �׷���
���� : ����
�ְ�ӵ� : 350
����ӵ� : 0
������ �ӵ� : 60
*/