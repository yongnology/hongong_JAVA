package sec01.exam03;

import java.awt.Toolkit;

// Runnable ÀÍ¸í ±¸Çö °´Ã¼ ÀÌ¿ë
public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("¶ò");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
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