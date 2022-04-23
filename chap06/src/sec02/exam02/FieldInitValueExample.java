package sec02.exam02;
// 필드값 출력
public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
	// 어떤 값으로 자동 초기화되는지 확인할 수 있다.	
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField);
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
/* 출력값
byteField: 0
shortField: 0
intField: 0
longField: 0
booleanField: false
charField: 
floatField: 0.0
doubleField: 0.0
arrField: null
referenceField: null
*/