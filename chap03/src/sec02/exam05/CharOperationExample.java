package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;	//char c1 = 66;으로 컴파일 된다.
		char c2 = 'A';
		//char c3 = c2 + 1;	// char 변수가 산술 연산에 사용되면 int 타입
		char c3 = (char) (c2 +1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}
}
/* 출력값
c1 : B
c2 : A
c3 : B
*/