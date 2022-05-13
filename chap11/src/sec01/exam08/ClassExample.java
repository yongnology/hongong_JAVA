package sec01.exam08;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// Ŭ���� ��ü �����ϴ� ��� 3����
		// ù ��° ���
		Class clazz = Car.class;
		// �� ��° ���
		Class clazz2 = Class.forName("sec01.exam08.Car");
		// �� ��° ���
		Car car = new Car();
		Class clazz3 = car.getClass();	// 
		
		//--------------------//
		
		System.out.println(clazz == clazz2);
		System.out.println(clazz == clazz3);
		
		System.out.println(clazz.getName());
		// CarŬ������ ��ü �̸��� �� �� �ִ�.
		System.out.println(clazz.getSimpleName());
		// Ŭ���� �̸��� ȣ��
		System.out.println(clazz.getPackage().getName());
	}
}
/* ��°�
true
true
sec01.exam08.Car
Car
sec01.exam08
*/