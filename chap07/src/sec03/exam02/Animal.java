package sec03.exam02;
// �߻� Ŭ���� ����
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼ҵ�
	public abstract void sound();
}