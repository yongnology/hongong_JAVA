package sec01.exam05;
// 객체의 문자 정보(toString() 메소드)
public class SmartPhoneExample {

	public static void main(String[] args) {
		
		SamrtPhone myPhone = new SamrtPhone("구글", "안드로이드");
		
		String strObj1 = myPhone.toString();
		
		System.out.println(strObj1);
		System.out.println(myPhone);
	}
}
/* 출력값
구글,안드로이드
구글,안드로이드
*/