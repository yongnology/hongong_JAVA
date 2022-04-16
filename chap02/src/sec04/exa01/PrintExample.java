package sec04.exa01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ���� : %d��\n", value);	//printf�� ����Ѵ�. printf�� ����
		System.out.printf("��ǰ�� ���� : %6d��\n", value);
		System.out.printf("��ǰ�� ���� : %-6d��\n", value);
		System.out.printf("��ǰ�� ���� : %06d��\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ���� : %10.2f\n", 10, area);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
/* ��°�
��ǰ�� ���� : 123��
��ǰ�� ���� :    123��
��ǰ�� ���� : 123   ��
��ǰ�� ���� : 000123��
�������� 10�� ���� ���� :     314.16
     1 | ȫ�浿        |         ����
*/