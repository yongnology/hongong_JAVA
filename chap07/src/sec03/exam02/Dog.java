package sec03.exam02;
// �߻� �޼ҵ� ������
public class Dog extends Animal {
	// �ڽ�Ŭ������ sound() �޼ҵ带 ������ ���� ������ ������ ����.
	
	public Dog() {
		this.kind = "������";	//Animal�� ���� �ִ� �ʵ�
	}
	
	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
