package sec01.exam05;
// ���� Ŭ����
public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();
		nested.print();
	}
}
/* ��°�
Nested-field
Nested-method
Outter-field
Outter-method
*/