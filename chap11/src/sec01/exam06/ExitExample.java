package sec01.exam06;
// exit() �޼ҵ�
public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0);	// ���������� ����
				//break;
			}
		}
		System.out.println("������ �ڵ�");
	}
}
/* ��°�
0
1
2
3
4
5
*/