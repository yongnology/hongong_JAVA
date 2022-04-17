package sec02.exam09;

public class BreakOutterExample {
// 바깥쪽 반복문 종료
	public static void main(String[] args) {
		Outter : for(char upper='A'; upper<='z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
/* 출력값
A-a
A-b
A-c
A-d
A-e
A-f
A-g
프로그램 실행 종료
*/