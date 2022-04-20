package sec02.question;

public class Question_5 {
// 중첩 for문을 이용해서 주어진 배열의 전체 항목의 합과 평균값 구하기
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		for(int i=0; i<array.length; i++) {
			for(int k=0; k<array[i].length; k++) {
				sum += array[i][k];
				count ++;
			}
		}
		avg = (double)sum/count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	}

}
/* 출력값
sum: 881
avg: 88.1
*/