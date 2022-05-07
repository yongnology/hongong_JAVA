package sec02.exam02;
// �͸� ���� ��ü ����
public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		// �͸� ��ü �ʵ� ���
		anony.field.turnOn();	// TV�� �մϴ�.
		anony.field.turnOff();	// TV�� ���ϴ�.
		// �͸� ��ü ���� ���� ���
		anony.method1();		// Audio�� �մϴ�. 	Audio�� ���ϴ�.
		// �͸� ��ü ���� �Ű��� ���
		anony.method2(new RemoteControl() {
				@Override
				public void turnOn() {
					System.out.println("SmartTV�� �մϴ�.");	// SmartTV�� �մϴ�.
				}
				@Override
				public void turnOff() {
					System.out.println("SmartTV�� ���ϴ�.");	// SmartTV�� ���ϴ�.
				}
			}
		);
	}
}
/* ��°�
TV�� �մϴ�.
TV�� ���ϴ�.
Audio�� �մϴ�.
Audio�� ���ϴ�.
SmartTV�� �մϴ�.
SmartTV�� ���ϴ�.
*/