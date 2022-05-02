package sec01.exam06.question;

public class SounableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
/* Ãâ·Â°ª
³Ä¿Ë
¸Û¸Û
*/