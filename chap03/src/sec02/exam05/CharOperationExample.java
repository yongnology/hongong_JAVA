package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;	//char c1 = 66;���� ������ �ȴ�.
		char c2 = 'A';
		//char c3 = c2 + 1;	// char ������ ��� ���꿡 ���Ǹ� int Ÿ��
		char c3 = (char) (c2 +1);
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
	}
}
/* ��°�
c1 : B
c2 : A
c3 : B
*/