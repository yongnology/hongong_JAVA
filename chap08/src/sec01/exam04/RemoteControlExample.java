package sec01.exam04;
// �������̽� ������ ���� ��ü ����
public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc;
		rc = new Televison();
		rc.turnOn();
		rc.turnOff();
		System.out.println("------");
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
/* ��°�
TV�� �մϴ�.
TV�� ���ϴ�.
------
Audio�� �մϴ�.
Audio�� ���ϴ�.
*/