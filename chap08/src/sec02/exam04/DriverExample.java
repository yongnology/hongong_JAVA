package sec02.exam04;
// ��ü Ÿ�� Ȯ��
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		System.out.println("---------");
		driver.drive(taxi);
	}
}
/* ��°�
��������� üũ�մϴ�.
������ �޸��ϴ�.
---------
�ýð� �޸��ϴ�.
*/