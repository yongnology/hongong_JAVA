package chap07.sec01.exam04;
// super 변수
public class SupersonicAirplane extends Airplan{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		} else {
			super.fly();	// Airplan 객체의 fly() 메소드 호출
							// System.out.println("일반비행입니다.");
		}
	}
}
