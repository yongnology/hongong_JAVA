package sec03.exam02;
// �߻� �޼ҵ� ������
public class Cat extends Animal{
	// �ڽ�Ŭ������ sound() �޼ҵ带 ������ ���� ������ ������ ����.
	
	public Cat() {
		this.kind = "������";
	}
	
	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
