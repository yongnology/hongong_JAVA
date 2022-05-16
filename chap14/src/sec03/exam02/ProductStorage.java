package sec03.exam02;
// Scanner�� �Էµ� ���ڿ� ���
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Scanner�� �Էµ� ���ڿ� ���
public class ProductStorage {
	private List<Product> list = new ArrayList<> ();	// List �÷��� ����
	private Scanner scanner = new Scanner(System.in);	// Ű���� �Է� Scanner ����
	private int counter;	// pno ���� ī����
	
	public void showMenu() {
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.��� | 2.��� | 3.����");
			System.out.println("----------------------------");
			
			System.out.print("���� : ");
			String selectNo = scanner.nextLine();	// ��ȣ �б�
			switch(selectNo) {
			case "1" : registerProduct(); break;	// product ���
			case "2" : showProducts(); break;		// ��ϵ� ��� product ���� ����
			case "3" : return;	// ���α׷� ����
			}
		}
	}
	
	public void registerProduct() {
		try {
			// pno ����
			Product product = new Product();
			product.setPno(++counter);
			
			// �̸��� �а� ����
			System.out.print("��ǰ�� : ");
			product.setName(scanner.nextLine());
			
			System.out.print("���� : ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			// ��� �а� ����
			System.out.print("��� : ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			// list�� product ����
			list.add(product);
			
		} catch(Exception e) {
			System.out.println("��� ����" + e.getMessage());
		}
	}
	
	public void showProducts() {
		// list�� ����� ��� product ������ ����Ϳ� ���
		for(Product p : list) {
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
}
