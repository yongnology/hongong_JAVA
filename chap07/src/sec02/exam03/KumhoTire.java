package sec02.exam03;
// Tire�� �ڽ� Ŭ����
public class KumhoTire extends Tire {
	// �ʵ�(Field)
	
	// ������(Constructor)
	public KumhoTire(String location, int maxRoatation) {
		super(location, maxRoatation);
	}
	// �޼ҵ�(Method)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+" kumhoTire ���� : "+
			(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		} else {
			System.out.println("***"+location+" KumhoTire ��ũ ***");
			return false;
		}
	}

}
