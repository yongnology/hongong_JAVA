package sec02.exam08;

public class BreakExample {
// break�� while�� ����
	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random() * 6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("���α׷� ����");
	}
}
/* ��°�
1
4
3
6
���α׷� ����
*/