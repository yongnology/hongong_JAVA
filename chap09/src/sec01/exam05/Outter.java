package sec01.exam05;
// 중첩 클래스에서 바깥 클래스 참조 얻기
public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// 중첩 객체 참조
			System.out.println(this.field);	// Nested-field
			this.method();	// Nested-method
			
			// 바깥 객체 참조
			System.out.println(Outter.this.field);	// Outter-field
				// Outter클래스의 객체 field
			Outter.this.method();	// Outter-method
		}
	}
}
