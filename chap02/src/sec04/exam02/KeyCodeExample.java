package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { //throws Exception�� �߰���.
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}

}
/* ��°�
a
keyCode : 97
keyCode : 13
keyCode : 10
*/