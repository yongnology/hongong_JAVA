package sec01.exam23;
// �ڵ� �ڽ̰� ��ڽ�
public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		// �ڵ� �ڽ�
		Integer obj = 100;
		// 100�⺻���� Integer��ü�� ������ �ؼ� obj�� ����
		System.out.println("value : " + obj.intValue());
		
		// ���� �� �ڵ� ��ڽ�
		int value = obj;	// �⺻Ÿ�� ������ ����Ÿ�� ���� ����(������ ���� �ʴ�)
		// obj�� �ڵ� ��ڽ̵Ǿ� �⺻Ÿ������ ����ȴ�.
		System.out.println("value : " + value);
		
		// ���� �� �ڵ� ��ڽ�
		int result = obj + 100;
		System.out.println("result : " + result);
	}

}
/* ��°�
value : 100
value : 100
result : 200
*/