package sec02.exam09;

public class ArrayCopyExample {
// System.arraycopy()�� �迭 ����
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		/* oldStrArray �迭(����)��, �������� ������ �׸��� ���� �ε���,
		 * �� �迭, �� �迭���� �ٿ����� ���� �ε���, ������ ����
		*/
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}
}
/* ��°�
java,array,copy,null,null,
*/