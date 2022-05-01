package sec01.exam03;
// 자식 클래스
public class Computer extends Calculator{
	// 재정의 시작
	@Override
	double areaCricle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r* r;
	}
	// 재정의 끝
}
