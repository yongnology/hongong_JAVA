package chap07.sec01.exam02;
// �ڽ� Ŭ����
public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);	// �θ� ������ ȣ��
		this.studentNo = studentNo;
	}
}
