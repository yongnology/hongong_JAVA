package sec01.exam04;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();	// Airplan�� fly() �޼ҵ�
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();	// SupersonicAirplan�� fly() �޼ҵ�
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
/* ��°�
�̷��մϴ�.
�Ϲݺ����Դϴ�.
�����Ӻ����Դϴ�.
�Ϲݺ����Դϴ�.
�����մϴ�.
*/