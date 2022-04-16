package sec04.exam04;

public class QstopExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("종료");
	}

}
/* 출력값
a
keyCode : 97
keyCode : 13
keyCode : 10
ab
keyCode : 97
keyCode : 98
keyCode : 13
keyCode : 10
q
keyCode : 113
종료
*/