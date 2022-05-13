package sec01.exam01;
// 메인 스레드만 이용한 경우
import java.awt.Toolkit;

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// Toolkit 객체 얻기
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}

}
/* 출력값
// 소리 5번 출력 후 콘솔 창 실행
띵
띵
띵
띵
띵
*/