package sec01.question.exam08;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println( obj1 == obj2);
		System.out.println( obj3 == obj4);
	}

}
/* 출력값
true
false
*/
// 값의 범위가 -128~127 이면 == 은 값을 비교하고 그 외에는 번지를 비교한다.