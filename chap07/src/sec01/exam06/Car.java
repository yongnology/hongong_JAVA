package sec01.exam06;
// �������� �� ���� final �޼ҵ�
public class Car {
	// �ʵ�(Field)
	public int speed;
	
	// ������(Constructor)
	
	// �޼ҵ�(Method)
	public void speedUp(){
		speed += 1;
		}
	
	// final �޼ҵ�
	public final void stop() {	// fianl�� ����
		System.out.println("���� ����");
		speed = 0;
	}
}
