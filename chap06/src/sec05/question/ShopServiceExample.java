package sec05.question;
// 285p 3��
public class ShopServiceExample {
	public static void main(String[]args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� ShopService ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� ShopService ��ü�Դϴ�.");
		}
	}
}
/* ��°�
���� ShopService ��ü�Դϴ�.
*/