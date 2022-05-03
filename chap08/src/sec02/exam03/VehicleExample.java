package sec02.exam03;
// 매개 변수의 다형성 테스트
public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();
		// Vehicle 인터페이스에는 checkFare() 가 없기에 오류
		
		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();	// Bus 클래스의 checkFare()
		
	}
}
/* 출력값
버스가 달립니다.
버스가 달립니다.
승차요금을 체크합니다.
*/