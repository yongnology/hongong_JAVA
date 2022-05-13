package sec01.exam06;
// exit() 메소드
public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			if(i == 5) {
				System.exit(0);	// 강제적으로 종료
				//break;
			}
		}
		System.out.println("마무리 코드");
	}
}
/* 출력값
0
1
2
3
4
5
*/