package sec03.exam01;
// 실체 클래스
public class SmartPhone extends Phone{
	// 생성자(Constructor)
	public SmartPhone(String owner) {
		super(owner);
	}
	
	// 메소드(Method)
	public void internetSearch() {
		System.out.println("인터넷을 검색을 합니다.");
	}
}
