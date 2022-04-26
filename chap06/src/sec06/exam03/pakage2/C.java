package sec06.exam03.pakage2;	//pakage1과 패키지가 다름
// 클래스의 접근 제한(3)
import sec06.exam03.pakage1.*;

public class C {
	A a;	// (o) A클래스 접근 불가(public을 안 붙였기 때문)
	B b;	// (x) B클래스 접근 가능(public을 붙였기 때문)
}
