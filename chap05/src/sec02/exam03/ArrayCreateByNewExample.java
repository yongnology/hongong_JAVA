package sec02.exam03;

public class ArrayCreateByNewExample {
// new �����ڷ� �迭 ����
	public static void main(String[] args) {
		int[] arr1 = new int[3];		//0���� �ʱ�ȭ
		for(int i =0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : "+ arr1[i]);
		}
		
		double[] arr2 = new double[3];	//0.0���� �ʱ�ȭ
		for(int i =0; i<3; i++) {
			System.out.println("arr2[" + i + "] : "+ arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2{" + i + "] : " + arr2[i]);
		}
		String[] arr3 = new String[3];	//null������ �ʱ�ȭ
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		for(int i = 0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}

}
/* ��°�
arr1[0] : 0
arr1[1] : 0
arr1[2] : 0
arr1[0] : 10
arr1[1] : 20
arr1[2] : 30
arr2[0] : 0.0
arr2[1] : 0.0
arr2[2] : 0.0
arr2{0] : 0.1
arr2{1] : 0.2
arr2{2] : 0.3
arr3[0] : null
arr3[1] : null
arr3[2] : null
arr3[0] : 1��
arr3[1] : 2��
arr3[2] : 3��
*/