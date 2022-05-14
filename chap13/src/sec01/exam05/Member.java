package sec01.exam05;
// hashCode()와 equals() 메소드 재정의
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// name 과 age 값이 같으면 true 리턴
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// name 과 age 값이 같으면 동일한 hashCode를 리턴
		return name.hashCode() + age;
	}
}
