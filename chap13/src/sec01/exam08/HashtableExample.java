package sec01.exam08;
// �Ƶ�� ��й�ȣ �˻��ϱ�
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// ���̵�� ��й�ȣ�� �̸� ����
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		// Ű����κ��� �Էµ� ������ �ޱ� ���� ����
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� : ");
			String id = sc.nextLine();
			// Ű����� �Է��� ���̵� ����
			
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��εǾ����ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
					System.out.println("------------------------");
				}
			} else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
				System.out.println("-------------------------");
			}
		}
	}

}
/* ��°�
���̵�� ��й�ȣ�� �Է����ּ���
���̵� : sss
��й�ȣ : 111

�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.
-------------------------
���̵�� ��й�ȣ�� �Է����ּ���
���̵� : summer
��й�ȣ : 1231

��й�ȣ�� ��ġ���� �ʽ��ϴ�.
-------------------------
���̵�� ��й�ȣ�� �Է����ּ���
���̵� : summer
��й�ȣ : 123

�α��εǾ����ϴ�.
*/