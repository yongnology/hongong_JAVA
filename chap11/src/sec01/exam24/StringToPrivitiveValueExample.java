package sec01.exam24;
// ���ڿ��� �⺻ Ÿ�� ������ ��ȯ
public class StringToPrivitiveValueExample {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10");
					// ���ڰ� intŸ������
		double value2 = Double.parseDouble("3.14");
					//���ڰ� double Ÿ������
		boolean value3 = Boolean.parseBoolean("true");
					// ���ڰ� booleanŸ������
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
	}
}
/* ��°�
value1 : 10
value2 : 3.14
value3 : true
*/