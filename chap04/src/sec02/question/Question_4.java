package sec02.question;

public class Question_4 {
// 중첩 for문 4x + 5y=60의 해 구하기. 단 x와 y는 10이하 자연수.
	public static void main(String[] args) {
		for(int x = 1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if((4*x+5*y)==60) {
					System.out.println("("+x+","+y+")");
				}
			}
		}
	}

}
/* 출력값
(5,8)
(10,4)
*/