package sec01.exam03;
// �޼ҵ� ������ �׽�Ʈ
public class ComputerExample {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCricle(r));
		System.out.println();	// �⺻ �θ� �޼ҵ带 �����ͼ� ���
		
		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCricle(r));
								// �����ǵ� �޼ҵ�� ���
	}
}
/* ��°�
Calculator ��ü�� areaCircle() ����
������ : 314.159

Computer ��ü�� areaCircle() ����
������ : 314.1592653589793
*/