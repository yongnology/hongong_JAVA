package sec03.exam02;
// Scanner�� �Էµ� ���ڿ� ���
public class ProductStorageExample {
	public static void main(String[] args) {
		ProductStorage productStorage = new ProductStorage();
		productStorage.showMenu();
	}
}

/* ��°�
----------------------------
1.��� | 2.��� | 3.����
----------------------------
���� : 1
��ǰ�� : ���콺
���� : 10000
��� : 5
----------------------------
1.��� | 2.��� | 3.����
----------------------------
���� : 1
��ǰ�� : Ű����
���� : 15000
��� : 7
----------------------------
1.��� | 2.��� | 3.����
----------------------------
���� : 2
1	���콺	10000	5
2	Ű����	15000	7
----------------------------
1.��� | 2.��� | 3.����
----------------------------
���� : 3
*/