package sec06.exam04.pakage1;
//생성자 접근 제한(2)
public class B {
	// 필드
	A a1 = new A(true);		// (o)
	A a2 = new A(1);		// (o)
	A a3 = new A("문자열");	// (x) private 생성자라 접근 불가(컴파일 에러)
}
