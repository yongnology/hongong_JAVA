package sec02.exam03;
// UI 클래스
public class Window {
	// 두개의 버튼을 만듬.
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	
	// 윈도우의 생성자
	Window() {
		// button1은 listener가 실행되어 윗 줄 Override된 onClick() 메소드 실행
		// 전화를 겁니다. 가 실행된다.
		button1.setOnClickListener( listener );	// 전화를 겁니다.
		
		// button2는 아래 줄 onCLick() 메소드가 실행
		button2.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});
	}
}
