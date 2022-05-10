package sec01.exam01;
// NullPointerException
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString());
	}
}
/* 출력값(예외)
java.lang.NullPointerException
(NullPointerExceptionExample.java:7)
*/