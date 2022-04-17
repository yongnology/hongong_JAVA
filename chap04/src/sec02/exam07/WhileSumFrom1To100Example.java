package sec02.exam07;

public class WhileSumFrom1To100Example {
// 1부터 100까지 합을 출력
	public static void main(String[] args) {
		int sum = 0;	//합계를 저장할 변수
		int i = 1;		// 루프 카운터 변수
		while(i<=100) {
			sum += i;
			i ++;
		}
	System.out.println("1~" + (i-1) + "합 : " +sum);
	}
}
/* 출력값
1~100합 : 5050
*/