package sec06.exam05.pakage1;
// 필드와 메소드의 접근제한(2)
public class B {
	public B() {
	A a = new A();
	a.field1 = 1;	//(o)
	a.field2 = 1;	//(o)
	//a.field3 = 1;	//(x) private 필드 접근 불가(컴파일 에러)
	
	a.method1();	//(o)
	a.method2();	//(o)
	//a.method3();	//(o) private 메소드 접근 불가(컴파일 에러)
	}
}
