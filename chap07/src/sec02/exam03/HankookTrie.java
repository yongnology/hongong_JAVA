package sec02.exam03;
// Tire의 자식 클래스
public class HankookTrie extends Tire {
	// 필드(Field)
	
	// 생성자(Constructor)
	public HankookTrie(String location, int maxRotation) {
		super(location, maxRotation);	// super() : 부모 생성자 호출
	}
	// 메소드(Method)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명 : "+
		(maxRotation-accumulatedRotation)+"회");
		return true;
		} else {
			System.out.println("***"+ location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
