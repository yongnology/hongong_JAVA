package sec05.exam01;
// 인스턴스 멤버와 this
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
	}

}
/* 출력값
포르쉐가 달립니다. (시속:10km/h
포르쉐가 달립니다. (시속:20km/h
포르쉐가 달립니다. (시속:30km/h
포르쉐가 달립니다. (시속:40km/h
벤츠가 달립니다. (시속:10km/h
벤츠가 달립니다. (시속:20km/h
벤츠가 달립니다. (시속:30km/h
벤츠가 달립니다. (시속:40km/h
*/