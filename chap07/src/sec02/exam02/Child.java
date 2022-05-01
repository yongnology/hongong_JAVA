package sec02.exam02;
// 자동 타입 변환 후의 멤버 접근
public class Child extends Parent{
	
// 재정의
@Override
public void method2() {
	System.out.println("Child-method()");
	}
//재정의 끝

public void method3() {
	System.out.println("Child-method3()");
}

}
