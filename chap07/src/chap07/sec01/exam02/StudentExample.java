package chap07.sec01.exam02;
// 자식 객체 이용
public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567",1);
		System.out.println("name : "+student.name);
		// 부모에게 상속받은 필드 출력
		System.out.println("ssn : "+student.ssn);
		// 부모에게 상속받은 필드 출력
		System.out.println("studentNo : " + student.studentNo);
	}
}
/* 출력값
name : 홍길동
ssn : 123456-1234567
studentNo : 1
*/