package sec02.exam03;
// Tire의 자식 클래스
public class KumhoTire extends Tire {
	// 필드(Field)
	
	// 생성자(Constructor)
	public KumhoTire(String location, int maxRoatation) {
		super(location, maxRoatation);
	}
	// 메소드(Method)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" kumhoTire 수명 : "+
			(maxRotation-accumulatedRotation)+"회");
			return true;
		} else {
			System.out.println("***"+location+" KumhoTire 펑크 ***");
			return false;
		}
	}

}
