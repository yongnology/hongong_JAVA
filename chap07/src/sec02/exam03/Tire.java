package sec02.exam03;

public class Tire {
	// �ʵ�(Filed)
	public int maxRotation;			// �ִ� ȸ��(Ÿ�̾� ����)
	public int accumulatedRotation;	// ���� ȸ����
	public String location;			// Ÿ�̾��� ��ġ
	
	// ������(Constructor)
	public Tire(String location, int maxRoatation) {
		this.location = location;
		this.maxRotation = maxRoatation;
	}
	
	// �޼ҵ�(Method)
	public boolean roll() {
		++ accumulatedRotation;
		// ���� ȸ��(����<�ִ�) �� ���
		if(accumulatedRotation<maxRotation) {
			System.out.println(location+"Tire ����:"+(maxRotation-accumulatedRotation)+"ȸ");
		return true;
		// ��ũ(���� = �ִ�)�� ��� ����
		} else {
			System.out.println("***"+location+"Tire ��ũ ***");
		return false;
		}
		
	}
}
