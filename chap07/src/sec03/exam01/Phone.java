package sec03.exam01;
// �߻� Ŭ����
public abstract class Phone {
	// �ʵ�(Field)
	public String owner;
	
	// ������(Constructor)
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼ҵ�(Method)
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}
