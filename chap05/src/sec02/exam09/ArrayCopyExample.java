package sec02.exam09;

public class ArrayCopyExample {
// System.arraycopy()로 배열 복사
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length );
		/* oldStrArray 배열(원본)을, 원본에서 복사할 항목의 시작 인덱스,
		 * 새 배열, 새 배열에서 붙여넣을 시작 인덱스, 복사할 개수
		*/
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ",");
		}
	}
}
/* 출력값
java,array,copy,null,null,
*/