package sec02.exam10;

public class ContinueExample {
// continue�� ����� for��
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {	// 2�� ���� �������� 0�� �ƴѰ��, �� Ȧ��
				continue;
			}
			System.out.println(i);
		}
	}

}
/* ��°�
2
4
6
8
10
*/