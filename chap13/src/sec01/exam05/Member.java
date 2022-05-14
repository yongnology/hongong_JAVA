package sec01.exam05;
// hashCode()�� equals() �޼ҵ� ������
public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// name �� age ���� ������ true ����
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		// name �� age ���� ������ ������ hashCode�� ����
		return name.hashCode() + age;
	}
}
