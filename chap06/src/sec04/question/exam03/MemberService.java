package sec04.question.exam03;
// 268p
public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
/* ��°�
�α��� �Ǿ����ϴ�.
�α׾ƿ� �Ǿ����ϴ�.
*/