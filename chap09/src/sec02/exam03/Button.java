package sec02.exam03;
// UI Ŭ����
public class Button {
	// (OnClickListener)�������̽� Ÿ�� �ʵ�
	OnClickListener listener;
	
	// �Ű� ������ ������
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	// ���� ��ü�� onClick() �޼ҵ� ȣ��
	void touch() {
		listener.onClick();
	}
	
	// ��ø �������̽�
	static interface OnClickListener{
		void onClick();
	}
}