package sec05.exam05;
// final 필드 테스트
public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		/*
		p1.nation = "usa";	// final필드로 선언했기 때문에 수정 불가.
		p1.ssn = "654321-7654321"; // final필드로 선언했기 때문에 수정 불가.
		*/
		p1.name = "홍삼원";		// final 필드가 아니기 때문에 가능.
		System.out.println(p1.name);	// 본인이 추가함
	}
}
/* 출력값
korea
123456-1234567
홍길동
홍삼원
*/