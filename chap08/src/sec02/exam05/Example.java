package sec02.exam05;
// ȣ�� ���� �޼ҵ�
public class Example {

	public static void main(String[] args) {
		
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		// InterfaceA�� methodA()�� ȣ�� ����
		
		InterfaceB ib = imp1;
		ib.methodB();
		// InterfaceB�� methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC�� methodA, B, C() ȣ�� ����
	}

}
