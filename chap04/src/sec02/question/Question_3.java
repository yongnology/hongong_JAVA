package sec02.question;

public class Question_3 {
// ���� ���� 5�� �ƴϸ� ��� �ֻ���. ���� 5�̸� ����
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("("+num1+", "+num2+")");
			if((num1+num2)==5) {
				break;
			}
		}
	}
}
/* ��°�
(3, 3)
(2, 4)
(6, 2)
(2, 5)
(1, 4)
*/