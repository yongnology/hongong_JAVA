package sec02.exam07;

public class WhileSumFrom1To100Example {
// 1���� 100���� ���� ���
	public static void main(String[] args) {
		int sum = 0;	//�հ踦 ������ ����
		int i = 1;		// ���� ī���� ����
		while(i<=100) {
			sum += i;
			i ++;
		}
	System.out.println("1~" + (i-1) + "�� : " +sum);
	}
}
/* ��°�
1~100�� : 5050
*/