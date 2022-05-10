package sec02.exam05;
// 예외 처리 떠넘기기
public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// e.printStackTrace(); : 예외가 뭐가 어디에 발생했는지 출력
			// 위 코드는 개발 과정에서 필요하고, 완료후에는 실질적인 예외처리 내용을 기입한다.
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
