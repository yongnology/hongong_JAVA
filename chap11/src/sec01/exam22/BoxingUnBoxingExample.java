package sec01.exam22;
// �⺻ Ÿ���� ���� �ڽ��ϰ� ��ڽ��ϱ�
public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// �ڽ�
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		// ���� �ڹ�9���� ���Ĵ� Integer�� deprecated ǥ�ð� ���.
		// deprecated : ���̻� ������� ���� Ű������ �ǹ�
		Integer obj3 = Integer.valueOf("300");
		
		// ��ڽ�
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
	}
}
/* ��°�
100
200
300
*/