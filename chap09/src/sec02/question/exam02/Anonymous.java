package sec02.question.exam02;
// 익명 구현 클래스와 객체 생성
public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}
	};
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run(); 
	}
}
