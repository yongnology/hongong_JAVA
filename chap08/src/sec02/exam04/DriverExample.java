package sec02.exam04;
// 객체 타입 확인
public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		System.out.println("---------");
		driver.drive(taxi);
	}
}
/* 출력값
승차요금을 체크합니다.
버스가 달립니다.
---------
택시가 달립니다.
*/