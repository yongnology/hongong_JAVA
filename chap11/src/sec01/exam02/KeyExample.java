package sec01.exam02;
// 다른 키로 인식
import java.util.*;

import sec01.exam03.*;

// hashCode
public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
	//  HashMap< 키, 값>
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3");
		
		System.out.println(hashMap.size());
		// size() 몇개의 key쌍이 있는지
		// key가 동일하다면 한번만 저장된다.
		
		/*
		HashMap<Member, String> hashMap2 = new HashMap<Member, String>();
		// key 타입이 Member
		
		hashMap2.put(new Member("fall"), "value1");
		hashMap2.put(new Member("winter"), "value2");
		hashMap2.put(new Member("fall"), "value3");
		
		System.out.println(hashMap2.size());
		*/
	}
}
/* 출력값
2
*/