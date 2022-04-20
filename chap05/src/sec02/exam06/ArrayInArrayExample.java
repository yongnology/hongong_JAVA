package sec02.exam06;

public class ArrayInArrayExample {
// 배열 속의 배열
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"] = "+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int [][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]="+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
			}
		}
	}

}
/* 출력값
mathScores[0][0] = 0
mathScores[0][1] = 0
mathScores[0][2] = 0
mathScores[1][0] = 0
mathScores[1][1] = 0
mathScores[1][2] = 0

englishScores[0]=0
englishScores[0]=0
englishScores[1]=0
englishScores[1]=0
englishScores[1]=0

javaScores[0][0]=95
javaScores[0][1]=80
javaScores[1][0]=92
javaScores[1][1]=96
javaScores[1][2]=80
*/