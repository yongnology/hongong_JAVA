package sec02.question;

import java.util.Scanner;

public class Question_6 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-------------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if(selectNo == 3) {
				for(int i=0; i< scores.length; i++) {
					System.out.println("scores["+i+"]: "+scores[i]);
				}
			} else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i = 0; i<scores.length; i++) {
					max = (max <scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg = (double)sum / studentNum;
				System.out.println("�ְ� ���� : "+ max);
				System.out.println("��� ���� : "+ avg);
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
/* ��°�
-------------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
-------------------------------------------------------
����> 1
�л���> 3
-------------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
-------------------------------------------------------
����> 2
scores[0]> 88
scores[1]> 95
scores[2]> 79
-------------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
-------------------------------------------------------
����> 3
scores[0]: 88
scores[1]: 95
scores[2]: 79
-------------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
-------------------------------------------------------
����> 4
�ְ� ���� : 95
��� ���� : 87.33333333333333
-------------------------------------------------------
1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����
-------------------------------------------------------
����> 5
���α׷� ����
*/
