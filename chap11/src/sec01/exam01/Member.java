package sec01.exam01;
// 
public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
		// obj(매개값이) member 타입인지 확인
			
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
			// Member 타입으로 강제 타입 변환하고
			// id 필드값이 동일한지 검사한 후, 동일하다면 true 리턴
		}
		return false;
	}
}
