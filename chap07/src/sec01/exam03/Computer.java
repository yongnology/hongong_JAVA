package sec01.exam03;
// �ڽ� Ŭ����
public class Computer extends Calculator{
	// ������ ����
	@Override
	double areaCricle(double r) {
		System.out.println("Computer ��ü�� areaCircle() ����");
		return Math.PI * r* r;
	}
	// ������ ��
}
