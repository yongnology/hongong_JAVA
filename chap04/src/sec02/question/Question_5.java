package sec02.question;

public class Question_5 {
// for�� Ȱ�� ����ϱ�
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
			if(j == i) {
				System.out.println();
				}
			}
		}
	}
}
/* ��°�
*
**
***
****
*/