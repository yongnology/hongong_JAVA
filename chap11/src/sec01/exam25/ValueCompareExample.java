package sec01.exam25;
// ���� ��ü ��
public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 �ʰ����� ���]");
		Integer obj1 = 300;	// 300�� �����ϴ� ���� ��ü�� ����
		Integer obj2 = 300;
		
		System.out.println("== ��� : " + (obj1 == obj2));
		System.out.println("��ڽ� �� \n== ��� : " + (obj1.intValue()==obj2.intValue()));
		System.out.println("equals() ��� : " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 �������� ���]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== ��� : " + (obj3 == obj4));
		System.out.println("��ڽ� �� \n== ��� : " + (obj3.intValue()==obj4.intValue()));
		System.out.println("equals() ��� : " + obj3.equals(obj4));
	}

}
/* ��°�
[-128~127 �ʰ����� ���]
== ��� : false
��ڽ� �� 
== ��� : true
equals() ��� : true

[-128~127 �������� ���]
== ��� : true
��ڽ� �� 
== ��� : true
equals() ��� : true
*/