package sec01.question.exam07;

public class FindAndReplaceExample {

	public static void main(String[] args) {
		String str = "��� ���α׷��� �ڹ� ���� ������ �� �ִ�.";
		int index = str.indexOf("�ڹ�");
		if(index == -1) {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.");
			str = str.replace("�ڹ�", "JAVA");
			System.out.println("-->"+str);
		}
	}
}
/* ��°�
�ڹ� ���ڿ��� ���ԵǾ� �ֽ��ϴ�.
-->��� ���α׷��� JAVA ���� ������ �� �ִ�.
*/