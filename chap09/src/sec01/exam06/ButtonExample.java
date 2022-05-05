package sec01.exam06;
// 버튼 이벤트 처리
public class ButtonExample {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
/* 출력값
전화를 겁니다.
메세지를 보냅니다.
*/