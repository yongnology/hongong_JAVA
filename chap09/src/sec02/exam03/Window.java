package sec02.exam03;
// UI Ŭ����
public class Window {
	// �ΰ��� ��ư�� ����.
	Button button1 = new Button();
	Button button2 = new Button();
	
	// �ʵ� �ʱⰪ���� ����
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	
	// �������� ������
	Window() {
		// button1�� listener�� ����Ǿ� �� �� Override�� onClick() �޼ҵ� ����
		// ��ȭ�� �̴ϴ�. �� ����ȴ�.
		button1.setOnClickListener( listener );	// ��ȭ�� �̴ϴ�.
		
		// button2�� �Ʒ� �� onCLick() �޼ҵ尡 ����
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޼����� �����ϴ�.");
			}
		});
	}
}
