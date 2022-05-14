package sec01.exam08;
// 아디와 비밀번호 검사하기
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		// 아이디와 비밀번호를 미리 저장
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		// 키보드로부터 입력된 내용을 받기 위해 생성
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			// 키보드로 입력한 아이디를 읽음
			
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("로그인되었습니다.");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					System.out.println("------------------------");
				}
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
				System.out.println("-------------------------");
			}
		}
	}

}
/* 출력값
아이디와 비밀번호를 입력해주세요
아이디 : sss
비밀번호 : 111

입력하신 아이디가 존재하지 않습니다.
-------------------------
아이디와 비밀번호를 입력해주세요
아이디 : summer
비밀번호 : 1231

비밀번호가 일치하지 않습니다.
-------------------------
아이디와 비밀번호를 입력해주세요
아이디 : summer
비밀번호 : 123

로그인되었습니다.
*/