package sec02.exam01;
//Stack�� �̿��� ���� ���̽�
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		// ������ ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}

}
/* ��°�
������ ���� : 10��
������ ���� : 500��
������ ���� : 50��
������ ���� : 100��
*/