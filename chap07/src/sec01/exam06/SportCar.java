package sec01.exam06;
// 재정의할 수 없는 final 메소드
public class SportCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
		}
	// speedUp() 메소드 재정의 가능
	
	@Override
	public void stop() {	// 오류 : fianl로 선언했기 떄문
	// stop() 메소드 재정의 불가.
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
