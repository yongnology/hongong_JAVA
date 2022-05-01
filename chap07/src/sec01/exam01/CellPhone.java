package sec01.exam01;
// 부모 클래스
public class CellPhone {
	// 필드(Field)
	String model;
	String color;
	
	// 생성자(Constructor)
	
	// 메소드(Method)
	void powerOn() { 
		System.out.println("전원을 킵니다."); 
		}
	void poweroff() {
		System.out.println("전원을 끕니다."); 
		}
	void bell() {
		System.out.println("벨이 울립니다."); 
		}
	void sendVoice(String message) {
		System.out.println("자기 : "+ message); 
		}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message); 
		}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
