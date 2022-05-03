package sec02.exam02;
// 매개 변수의 다형성 테스트
public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// 자동 타이 변환: Vehicle vehicle = bus;
		driver.drive(taxi); // 자동 타이 변환: Vehicle vehicle = taxi;
		
		/* 위 내줄을 이렇게도 쓸 수 있다.
		driver.drive(new Bus());
		driver.drive(new Taxi());
		*/
		
	}
}
/* 출력값
버스가 달립니다.
택시가 달립니다.
*/