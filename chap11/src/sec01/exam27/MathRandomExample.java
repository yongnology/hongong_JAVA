package sec01.exam27;
// 임의의 주사위의 눈 얻기
public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		// 1~9까지 랜덤값
		System.out.println("주사위의 눈 : " + num);
	}
}
/* 출력값
주사위의 눈 : 5
*/