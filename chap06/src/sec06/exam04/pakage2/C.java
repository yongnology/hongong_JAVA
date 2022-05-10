package sec06.exam04.pakage2;	// 패키지가 다름
// 생성자 접근 제한(3)
import sec06.exam04.pakage1.*;

public class C {
	// 필드(Field) A
	A a1 = new A(true);		// (o)
	//A a2 = new A(1);		// (x) default 생성자 접근 불가(컴파일 에러)
	//A a3 = new A("문자열");	// (x) private 생성자라 접근 불가(컴파일 에러)
}
