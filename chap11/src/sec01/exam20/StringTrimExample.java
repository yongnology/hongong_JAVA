package sec01.exam20;
// ���ڿ� �յ� ���� ����
public class StringTrimExample {
	
	public static void main(String[] args) {
		
		String tel1 = "  02";
		String tel2 = "123  ";
		String tel3 = "    1234    ";
		
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		// �� �� ������ ������ ���ڿ��� �����Ѵ�. �� �߰��� ������ �������� �ʴ´�.
		System.out.println(tel);
	}
}

/* ��°�
021231234
*/