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
		// obj(�Ű�����) member Ÿ������ Ȯ��
			
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
			// Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ�
			// id �ʵ尪�� �������� �˻��� ��, �����ϴٸ� true ����
		}
		return false;
	}
}
