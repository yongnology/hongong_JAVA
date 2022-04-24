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
		System.out.println("로그아웃 되었습니다.");
	}
}
/* 출력값
로그인 되었습니다.
로그아웃 되었습니다.
*/