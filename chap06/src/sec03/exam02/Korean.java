package sec03.exam02;
// 생성자에서 필드 초기화
public class Korean {
	// 필드(Field)
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자(Constructor)
	public Korean(String s, String n) {
		name = s;
		ssn = n;
	}
}
