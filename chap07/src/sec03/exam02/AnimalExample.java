package sec03.exam02;
// ���� Ŭ����
public class AnimalExample {
// sound �޼ҵ带 ȣ���ϴ� ������ ���
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;	// �ʱ�ȭ
		animal = new Dog();		// Ÿ�� ��ȯ
		animal.sound();			// �ڽ�Ŭ���� �޼ҵ�
		animal = new Cat();		// Ÿ�� ��ȯ
		animal.sound();			// �ڽ�Ŭ���� �޼ҵ�
		System.out.println("-----");
		
		// �޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
/* ��°�
�۸�
�߿�
-----
�۸�
�߿�
-----
�۸�
�߿�
*/