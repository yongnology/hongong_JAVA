package sec02.exam04;

public class ForFloatCounterExample {
// float Ÿ�� ī���� ����
	public static void main(String[] args) {
		for(float x=0.1f; x<=1.0f; x+=0.1f) {	//0.f�� 0.1���� ũ�� ������ 9�� ���
			System.out.println(x);
		}
	}
}
/* ��°�
0.1
0.2
0.3
0.4
0.5
0.6
0.70000005
0.8000001
0.9000001
*/