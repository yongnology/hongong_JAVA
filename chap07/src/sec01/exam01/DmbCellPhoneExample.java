package sec01.exam01;
// �ڽ� Ŭ����
public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// DmbCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbCellPhone.model);
		System.out.println("���� : " + dmbCellPhone.color);
		
		// DmbCellPhone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbCellPhone.channel);
		
		// CellPhone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���.");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		
		// DmbCellPhone Ŭ������ �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
/* ��°�
�� : �ڹ���
���� : ����
ä�� : 10
������ ŵ�ϴ�.
���� �︳�ϴ�.
�ڱ� : ��������
���� : �ȳ��ϼ���! ���� ȫ�浿�ε���.
�ڱ� : ��~ �� �ݰ����ϴ�.
��ȭ�� �����ϴ�.
ä��10�� DMB ��� ������ �����մϴ�.
ä��12������ �ٲߴϴ�.
DMB ��� ������ ����ϴ�.
*/