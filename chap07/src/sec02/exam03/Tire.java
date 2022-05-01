package sec02.exam03;

public class Tire {
	// 필드(Filed)
	public int maxRotation;			// 최대 회전(타이어 수명)
	public int accumulatedRotation;	// 누적 회전수
	public String location;			// 타이어의 위치
	
	// 생성자(Constructor)
	public Tire(String location, int maxRoatation) {
		this.location = location;
		this.maxRotation = maxRoatation;
	}
	
	// 메소드(Method)
	public boolean roll() {
		++ accumulatedRotation;
		// 정상 회전(누적<최대) 일 경우
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire 수명:"+(maxRotation-accumulatedRotation)+"회");
		return true;
		// 펑크(누적 = 최대)일 경우 실행
		} else {
			System.out.println("***"+location+"Tire 펑크 ***");
		return false;
		}
		
	}
}
