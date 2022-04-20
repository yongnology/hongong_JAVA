package sec02.exam08;

public class ArrayCopyByForExample {
// for문으로 배열 복사
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };	// oldIntArray 값 초기화
		int[] newIntArray = new int[5];		// newIntArray 크기 설정
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];	// 복사
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");	//newIntArray 출력
		}
	}

}
/* 출력값
1, 2, 3, 0, 0, 
*/