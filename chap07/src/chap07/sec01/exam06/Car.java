package chap07.sec01.exam06;
// 재정의할 수 없는 final 메소드
public class Car {
	// 필드(Field)
	public int speed;
	
	// 메소드(Method)
	public void speedUp(){ speed += 1; }
	
	// final 메소드
	public final void stip() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
