package sec02.exam04;
// 실행 클래스
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		// 자동타입변환 : Vehicle vehicle = bus;
		driver.drive(taxi);
		// 자동타입변환 : Vehicle vehicle = taxi;
	}
}
/* 출력값
버스가 달립니다.
택시가 달립니다.
*/