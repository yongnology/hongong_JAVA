package sec02.exam03;
// Tire�� �ڽ� Ŭ����
public class HankookTrie extends Tire {
	// �ʵ�(Field)
	
	// ������(Constructor)
	public HankookTrie(String location, int maxRotation) {
		super(location, maxRotation);	// super() : �θ� ������ ȣ��
	}
	// �޼ҵ�(Method)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire ���� : "+
		(maxRotation-accumulatedRotation)+"ȸ");
		return true;
		} else {
			System.out.println("***"+ location + "HankookTire ��ũ ***");
			return false;
		}
	}
}
