package sec02.exam04;
// ��ü Ÿ�� Ȯ��
public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
		// Vehicle �Ű� ������ �����ϴ� ��ü�� Bus���� ����
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
