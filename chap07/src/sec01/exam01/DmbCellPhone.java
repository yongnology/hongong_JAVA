package sec01.exam01;
// �ڽ�Ŭ����
public class DmbCellPhone extends CellPhone{
	// �ʵ�(Field)
	int channel;
	
	// ������(Constructor)
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;	// cellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.color = color; // cellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	
	// �޼ҵ�(Method)
	void turnOnDmb() {
		System.out.println("ä��" + channel+"�� DMB ��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä��"+channel+"������ �ٲߴϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
