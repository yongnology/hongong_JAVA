package sec02.exam03;
// 실행 클래스
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();	// Car 객체 생성
		
		// Car 객체의 run() 메소드 5번 반복 실행
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTrie("앞왼쪽", 15);
				break;
				// 앞왼쪽 타이어가 펑크 났을 때 HankookTire 로 교체
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
				// 앞오른쪽 타이어가 펑크 났을 때 KumhoTire로 교체
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.BackLeftTire = new HankookTrie("뒤왼쪽", 14);
				break;
				// 뒤왼쪽 타이어가 펑크 났을 때 HankookTire로 교체
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.BackRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
				// 뒤오른쪽 타이어가 퍼읔 났을 때 KumhoTire로 교체
			}
			System.out.println("---------------------------");
			// 1회전시 출력되는 내용을 구분
		}
	}
}
/* 출력값
[자동차가 달립니다.]
앞왼쪽Tire 수명:5회
앞오른쪽Tire 수명:1회
뒤왼쪽Tire 수명:2회
뒤오른쪽Tire 수명:3회
---------------------------
[자동차가 달립니다.]
앞왼쪽Tire 수명:4회
***앞오른쪽Tire 펑크 ***
[자동차가 멈춥니다.]
앞 오른쪽 KumhoTire로 교체
---------------------------
[자동차가 달립니다.]
앞왼쪽Tire 수명:3회
앞오른쪽 kumhoTire 수명 : 12회
뒤왼쪽Tire 수명:1회
뒤오른쪽Tire 수명:2회
---------------------------
[자동차가 달립니다.]
앞왼쪽Tire 수명:2회
앞오른쪽 kumhoTire 수명 : 11회
***뒤왼쪽Tire 펑크 ***
[자동차가 멈춥니다.]
뒤왼쪽 HankookTire로 교체
---------------------------
[자동차가 달립니다.]
앞왼쪽Tire 수명:1회
앞오른쪽 kumhoTire 수명 : 10회
뒤왼쪽HankookTire 수명 : 13회
뒤오른쪽Tire 수명:1회
---------------------------
*/