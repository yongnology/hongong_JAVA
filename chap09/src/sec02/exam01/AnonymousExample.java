package sec02.exam01;
// 익명 자식 객체 생성
public class AnonymousExample {

	public static void main(String[] args) {
		Anonymos anony = new Anonymos();
		// 익명 객체 필드 사용
		anony.field.wake();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		// 익명 객체 매개값 사용
		anony.method2(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			});
	}
}
/* 출력값
6시에 일어납니다.
출근합니다.
7시에 일어납니다.
산책합니다.
8시에 일어납니다.
공부합니다.
*/