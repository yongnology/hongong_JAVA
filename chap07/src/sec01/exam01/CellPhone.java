package sec01.exam01;
// �θ� Ŭ����
public class CellPhone {
	// �ʵ�(Field)
	String model;
	String color;
	
	// ������(Constructor)
	
	// �޼ҵ�(Method)
	void powerOn() { 
		System.out.println("������ ŵ�ϴ�."); 
		}
	void poweroff() {
		System.out.println("������ ���ϴ�."); 
		}
	void bell() {
		System.out.println("���� �︳�ϴ�."); 
		}
	void sendVoice(String message) {
		System.out.println("�ڱ� : "+ message); 
		}
	void receiveVoice(String message) {
		System.out.println("���� : " + message); 
		}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
