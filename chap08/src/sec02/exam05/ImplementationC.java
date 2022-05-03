package sec02.exam05;
// 하위 인터페이스 구현
public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("ImplementationC-MethodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementationC-MethodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementationC-MethodC() 실행");
	}
	

}