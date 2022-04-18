package sec02.question;

public class Question_3 {
// 눈의 합이 5가 아니면 계속 주사위. 합이 5이면 종료
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			System.out.println("("+num1+", "+num2+")");
			if((num1+num2)==5) {
				break;
			}
		}
	}
}
/* 출력값
(3, 3)
(2, 4)
(6, 2)
(2, 5)
(1, 4)
*/