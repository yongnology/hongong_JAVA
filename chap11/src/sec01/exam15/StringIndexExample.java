package sec01.exam15;
// ���ڿ� ���� ����
public class StringIndexExample {

	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		// ���ڿ� ���� ã�� ��� 1) indexOf()
		if(subject.indexOf("�ڹ�") != -1) {
			// -1�� �����ϸ� Ư�� ���ڿ��� ���ԵǾ� ���� �ʴٴ� ��
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		
		// ���ڿ� ���� ã�� ��� 2) contains()
		if(subject.contains("�ڹ�")) {
			// -1�� �����ϸ� Ư�� ���ڿ��� ���ԵǾ� ���� �ʴٴ� ��
			System.out.println("�ڹٿ� ���õ� å�̱���");
		} else {
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
	}
}
/* ��°�
3
�ڹٿ� ���õ� å�̱���
*/