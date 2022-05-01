package sec01.exam06;
// 재정의할 수 없는 final 메소드
public class Car {
	// 필드(Field)
	public int speed;
	
	// 생성자(Constructor)
	
	// 메소드(Method)
	public void speedUp(){
		speed += 1;
		}
	
	// final 메소드
	public final void stop() {	// fianl로 선언
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
