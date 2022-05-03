package sec02.exam05;
// 호출 가능 메소드
public class Example {

	public static void main(String[] args) {
		
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		// InterfaceA는 methodA()만 호출 가능
		
		InterfaceB ib = imp1;
		ib.methodB();
		// InterfaceB는 methodB()만 호출 가능
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC는 methodA, B, C() 호출 가능
	}

}
