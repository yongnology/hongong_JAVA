package chap07.sec01.exam06;
// �������� �� ���� final �޼ҵ�
public class SportCar extends Car{
	@Override
	public void speedUp() { speed += 10; }
	// speedUp() �޼ҵ� ������ ����
	
	@Override
	public void stop() {
	// stop() �޼ҵ� ������ �Ұ�.
		System.out.println("������ī�� ����");
		speed = 0;
	}
}
