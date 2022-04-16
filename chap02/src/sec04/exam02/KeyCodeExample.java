package sec04.exam02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception { //throws Exception가 추가됨.
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
	}

}
/* 출력값
a
keyCode : 97
keyCode : 13
keyCode : 10
*/