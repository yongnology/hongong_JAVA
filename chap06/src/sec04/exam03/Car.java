package sec04.exam03;
// return��
public class Car {
	// �ʵ�(Field)
	int gas;
	
	// ������ (Constructor)
	
	// �޼ҵ�(Method)
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;	// false�� ����
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;		// true�� ����
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޸��ϴ�. (gas �ܷ� : "+gas+")");
				gas -= 1;
			} else {
				System.out.println("����ϴ�. (gas �ܷ� : "+gas+")");
				return;		// �޼ҵ� ���� ����
			}
		}
	}
}
