package sec01.exam13;
// ���ڿ� �� : equals() �޼ҵ�
public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = new String("�Ź�ö");
		String strVar2 = "�Ź�ö";
		
		if(strVar1 == strVar2) {
			System.out.println("���� String ��ü�� ����");
		} else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("���� ���ڿ��� ����");
		} else {
			System.out.println("�ٸ� ���ڸ� ����");
		}
	}

}
/* ��°�
�ٸ� String ��ü�� ����
���� ���ڿ��� ����
*/