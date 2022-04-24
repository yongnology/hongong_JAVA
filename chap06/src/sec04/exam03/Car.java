package sec04.exam03;
// return문
public class Car {
	// 필드(Field)
	int gas;
	
	// 생성자 (Constructor)
	
	// 메소드(Method)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;	// false를 리턴
		}
		System.out.println("gas가 있습니다.");
		return true;		// true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (gas 잔량 : "+gas+")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다. (gas 잔량 : "+gas+")");
				return;		// 메소드 실행 종료
			}
		}
	}
}
