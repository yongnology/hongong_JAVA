package sec02.exam08;

public class ArrayCopyByForExample {
// for������ �迭 ����
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };	// oldIntArray �� �ʱ�ȭ
		int[] newIntArray = new int[5];		// newIntArray ũ�� ����
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];	// ����
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");	//newIntArray ���
		}
	}

}
/* ��°�
1, 2, 3, 0, 0, 
*/