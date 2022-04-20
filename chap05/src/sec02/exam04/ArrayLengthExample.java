package sec02.exam04;

public class ArrayLengthExample {
// ¹è¿­ÀÇ length ÇÊµå
	public static void main(String[] args) {
		int[] scores = { 83, 90, 87 };
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("Æò±Õ : " + avg);
	}

}
/* Ãâ·Â°ª
ÃÑÇÕ : 260
Æò±Õ : 86.66666666666667
*/