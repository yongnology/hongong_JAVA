package chap07.sec01.exam06;
// �������� �� ���� final �޼ҵ�
public class Car {
	// �ʵ�(Field)
	public int speed;
	
	// �޼ҵ�(Method)
	public void speedUp(){ speed += 1; }
	
	// final �޼ҵ�
	public final void stip() {
		System.out.println("���� ����");
		speed = 0;
	}
}
