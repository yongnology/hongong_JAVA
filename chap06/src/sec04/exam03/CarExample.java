package sec04.exam03;
// return ��
public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);	// Car�� setGas() �޼ҵ� ȣ��
		
		boolean gasState = myCar.isLeftGas();	// Car�� isLeftGas() �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();	// Car�� run() �޼ҵ� ȣ��
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		} else {
			System.out.println("gas�� �����ϼ���.");
		}
	}

}
/* ��°�
gas�� �ֽ��ϴ�.
����մϴ�.
�޸��ϴ�. (gas �ܷ� : 5)
�޸��ϴ�. (gas �ܷ� : 4)
�޸��ϴ�. (gas �ܷ� : 3)
�޸��ϴ�. (gas �ܷ� : 2)
�޸��ϴ�. (gas �ܷ� : 1)
����ϴ�. (gas �ܷ� : 0)
gas�� �����ϴ�.
gas�� �����ϼ���.
*/