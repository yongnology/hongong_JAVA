package sec02.exam02;
// �Ű� ������ ������ �׽�Ʈ
public class DriverExample {
	public static void main(String[] args) {
		// ��ü ����
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// �ڵ� Ÿ�� ��ȯ: Vehicle vehicle = bus;
		driver.drive(taxi); // �ڵ� Ÿ�� ��ȯ: Vehicle vehicle = taxi;
		
		/* �� ������ �̷��Ե� �� �� �ִ�.
		driver.drive(new Bus());
		driver.drive(new Taxi());
		*/
		
	}
}
/* ��°�
������ �޸��ϴ�.
�ýð� �޸��ϴ�.
*/