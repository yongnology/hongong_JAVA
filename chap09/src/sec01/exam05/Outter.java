package sec01.exam05;
// ��ø Ŭ�������� �ٱ� Ŭ���� ���� ���
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
			// ��ø ��ü ����
			System.out.println(this.field);	// Nested-field
			this.method();	// Nested-method
			
			// �ٱ� ��ü ����
			System.out.println(Outter.this.field);	// Outter-field
				// OutterŬ������ ��ü field
			Outter.this.method();	// Outter-method
		}
	}
}
