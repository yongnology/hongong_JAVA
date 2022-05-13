package sec01.exam07;
// 프로그램 실행 요소 시간 구하기
public class SystemTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();	// 시작 시간 읽기
		
		int sum = 0;
		for(int i =1; i<= 1000000; i++) {
			sum+=i;
		}
		
		long time2 = System.nanoTime();	// 끝나는시간
		
		System.out.println("1~1000000까지의 합 : \n" + sum);
		System.out.println("계산에 " + (time2 - time1)+"나노초가 소요");
	}

}
/* 출력값
1~1000000까지의 합 : 
1784293664
계산에 1617200나노초가 소요
*/