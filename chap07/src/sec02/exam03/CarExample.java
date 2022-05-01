package sec02.exam03;
// ���� Ŭ����
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();	// Car ��ü ����
		
		// Car ��ü�� run() �޼ҵ� 5�� �ݺ� ����
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("�տ��� HankookTire�� ��ü");
				car.frontLeftTire = new HankookTrie("�տ���", 15);
				break;
				// �տ��� Ÿ�̾ ��ũ ���� �� HankookTire �� ��ü
			case 2:
				System.out.println("�տ����� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
				// �տ����� Ÿ�̾ ��ũ ���� �� KumhoTire�� ��ü
			case 3:
				System.out.println("�ڿ��� HankookTire�� ��ü");
				car.BackLeftTire = new HankookTrie("�ڿ���", 14);
				break;
				// �ڿ��� Ÿ�̾ ��ũ ���� �� HankookTire�� ��ü
			case 4:
				System.out.println("�ڿ����� KumhoTire�� ��ü");
				car.BackRightTire = new KumhoTire("�ڿ�����", 17);
				break;
				// �ڿ����� Ÿ�̾ ���� ���� �� KumhoTire�� ��ü
			}
			System.out.println("---------------------------");
			// 1ȸ���� ��µǴ� ������ ����
		}
	}
}
/* ��°�
[�ڵ����� �޸��ϴ�.]
�տ���Tire ����:5ȸ
�տ�����Tire ����:1ȸ
�ڿ���Tire ����:2ȸ
�ڿ�����Tire ����:3ȸ
---------------------------
[�ڵ����� �޸��ϴ�.]
�տ���Tire ����:4ȸ
***�տ�����Tire ��ũ ***
[�ڵ����� ����ϴ�.]
�� ������ KumhoTire�� ��ü
---------------------------
[�ڵ����� �޸��ϴ�.]
�տ���Tire ����:3ȸ
�տ����� kumhoTire ���� : 12ȸ
�ڿ���Tire ����:1ȸ
�ڿ�����Tire ����:2ȸ
---------------------------
[�ڵ����� �޸��ϴ�.]
�տ���Tire ����:2ȸ
�տ����� kumhoTire ���� : 11ȸ
***�ڿ���Tire ��ũ ***
[�ڵ����� ����ϴ�.]
�ڿ��� HankookTire�� ��ü
---------------------------
[�ڵ����� �޸��ϴ�.]
�տ���Tire ����:1ȸ
�տ����� kumhoTire ���� : 10ȸ
�ڿ���HankookTire ���� : 13ȸ
�ڿ�����Tire ����:1ȸ
---------------------------
*/