package sec02.exam08;

public class BreakExample {
// break로 while문 종료
	public static void main(String[] args) {
		while(true) {
			int num = (int) (Math.random() * 6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}
/* 출력값
1
4
3
6
프로그램 종료
*/