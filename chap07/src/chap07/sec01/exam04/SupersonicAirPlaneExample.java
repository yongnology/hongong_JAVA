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
/* 출력값
이륙합니다.
일반비행입니다.
초음속비행입니다.
일반비행입니다.
착륙합니다.
*/