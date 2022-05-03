package sec02.exam04;
// 객체 타입 확인
public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
		// Vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
