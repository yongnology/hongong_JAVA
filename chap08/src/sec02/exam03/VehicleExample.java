package sec02.exam03;
// �Ű� ������ ������ �׽�Ʈ
public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		// Vehicle �������̽����� checkFare() �� ���⿡ ����
		
		// ���� Ÿ�� ��ȯ
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();	// Bus Ŭ������ checkFare()
		
	}
}
/* ��°�
������ �޸��ϴ�.
������ �޸��ϴ�.
��������� üũ�մϴ�.
*/