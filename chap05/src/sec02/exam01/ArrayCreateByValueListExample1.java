package sec02.exam01;

public class ArrayCreateByValueListExample1 {
// °ª ¸ñ·ÏÀ¸·Î ¹è¿­ »ý¼º
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87};
		
		System.out.println("score[0] : " + scores[0]);
		System.out.println("score[1] : " + scores[1]);
		System.out.println("score[2] : " + scores[2]);
		
		int sum= 0;
		for(int i = 0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		double avg = (double) sum / 3;
		System.out.println("Æò±Õ : "+ avg);
	}

}
/* Ãâ·Â°ª
score[0] : 83
score[1] : 90
score[2] : 87
ÃÑÇÕ : 260
Æò±Õ : 86.66666666666667
*/