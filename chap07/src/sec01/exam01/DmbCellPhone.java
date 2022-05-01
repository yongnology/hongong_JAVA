package sec01.exam01;
// 자식클래스
public class DmbCellPhone extends CellPhone{
	// 필드(Field)
	int channel;
	
	// 생성자(Constructor)
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;	// cellPhone 클래스로부터 상속받은 필드
		this.color = color; // cellPhone 클래스로부터 상속받은 필드
		this.channel = channel;
	}
	
	// 메소드(Method)
	void turnOnDmb() {
		System.out.println("채널" + channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}
