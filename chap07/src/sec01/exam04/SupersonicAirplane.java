package sec01.exam04;
// super ����
public class SupersonicAirplane extends Airplan{
	// �����带 ����� ����
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// �ʵ�(Field)
	// �����带 ������ �� �ִ� �ʵ弱��
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("�����Ӻ����Դϴ�.");
		} else {
			super.fly();	// Airplan ��ü�� fly() �޼ҵ� ȣ��
							// System.out.println("�Ϲݺ����Դϴ�.");
		}
	}
}
