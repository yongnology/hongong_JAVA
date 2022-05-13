package sec01.exam05;

import java.awt.Toolkit;

// Thread ÀÍ¸í ÀÚ½Ä °´Ã¼ ÀÌ¿äÇÏ±â
public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {

					}
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch(Exception e) {};
		}
	}

}
/* Ãâ·Â°ª
//¼Ò¸®¿Í ÇÔ²²
¶ò
¶ò
¶ò
¶ò
¶ò
*/