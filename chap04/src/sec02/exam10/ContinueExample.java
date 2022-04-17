package sec02.exam10;

public class ContinueExample {
// continue를 사용한 for문
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {	// 2로 나눈 나머지가 0이 아닌경우, 즉 홀수
				continue;
			}
			System.out.println(i);
		}
	}

}
/* 출력값
2
4
6
8
10
*/