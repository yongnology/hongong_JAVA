package sec04.exam03;

public class ContinueKeyCodeReadExample {

	public static void main(String[] args) throws Exception{ //throws Exception�� �߰���.
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
		}
	}

}
/* ��°�
a
keyCode : 97
keyCode : 13
keyCode : 10
ab
keyCode : 97
keyCode : 98
keyCode : 13
keyCode : 10
abc
keyCode : 97
keyCode : 98
keyCode : 99
keyCode : 13
keyCode : 10
*/