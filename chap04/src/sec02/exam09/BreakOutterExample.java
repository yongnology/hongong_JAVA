package sec02.exam09;

public class BreakOutterExample {
// �ٱ��� �ݺ��� ����
	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("���α׷� ���� ����");
	}
}
/* ��°�
A-a
A-b
A-c
A-d
A-e
A-f
A-g
���α׷� ���� ����
*/