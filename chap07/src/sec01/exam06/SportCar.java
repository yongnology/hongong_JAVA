package sec01.exam06;
// �������� �� ���� final �޼ҵ�
public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		}
	// speedUp() �޼ҵ� ������ ����
	
	@Override
	public void stop() {	// ���� : fianl�� �����߱� ����
	// stop() �޼ҵ� ������ �Ұ�.
		System.out.println("������ī�� ����");
		speed = 0;
	}
}
