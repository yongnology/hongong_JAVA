package sec01.exam25;
// 포장 객체 비교
public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;	// 300을 포장하는 포장 객체를 참조
		Integer obj2 = 300;
		
		System.out.println("== 결과 : " + (obj1 == obj2));
		System.out.println("언박싱 후 \n== 결과 : " + (obj1.intValue()==obj2.intValue()));
		System.out.println("equals() 결과 : " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("== 결과 : " + (obj3 == obj4));
		System.out.println("언박싱 후 \n== 결과 : " + (obj3.intValue()==obj4.intValue()));
		System.out.println("equals() 결과 : " + obj3.equals(obj4));
	}

}
/* 출력값
[-128~127 초과값일 경우]
== 결과 : false
언박싱 후 
== 결과 : true
equals() 결과 : true

[-128~127 범위값일 경우]
== 결과 : true
언박싱 후 
== 결과 : true
equals() 결과 : true
*/