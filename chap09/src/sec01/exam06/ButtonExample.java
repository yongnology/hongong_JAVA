package sec01.exam06;
// ��ư �̺�Ʈ ó��
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
/* ��°�
��ȭ�� �̴ϴ�.
�޼����� �����ϴ�.
*/