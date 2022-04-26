package sec06.exam05.pakage2;	// 패키지가 다름
//필드와 메소드의 접근제한(3)
import sec06.exam05.pakage1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;	//(o)
		a.field2 = 1;	//(x) default 필드 접그 불가(컴파일 에러)
		a.field3 = 1;	//(x) private 필드 접근 불가(컴파일 에러)
		
		a.method1();	//(o)
		a.method2();	//(x) default 메소드 접그 불가(컴파일 에러)
		a.method3();	//(o) private 메소드 접근 불가(컴파일 에러)
	}
}
