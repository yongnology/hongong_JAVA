package chap07.sec01.exam04;

public class SupersonicAirPlaneExample {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
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