package sec01.exam17;
// ���ڿ� ��ġ�ϱ�
// replace() �޼ҵ�� ���ڿ� ��ġ �� ���ο� ���ڿ��� �����Ѵ�. �� ������(X) 
public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newStr = oldStr.replace("�ڹ�", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
/* ��°�
�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.
JAVA�� ��ü ���� ����Դϴ�. JAVA�� ǳ���� API�� �����մϴ�.
*/