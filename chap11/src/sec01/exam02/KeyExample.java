package sec01.exam02;
// �ٸ� Ű�� �ν�
import java.util.*;

import sec01.exam03.*;

// hashCode
public class KeyExample {
	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
	//  HashMap< Ű, ��>
		
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3");
		
		System.out.println(hashMap.size());
		// size() ��� key���� �ִ���
		// key�� �����ϴٸ� �ѹ��� ����ȴ�.
		
		/*
		HashMap<Member, String> hashMap2 = new HashMap<Member, String>();
		// key Ÿ���� Member
		
		hashMap2.put(new Member("fall"), "value1");
		hashMap2.put(new Member("winter"), "value2");
		hashMap2.put(new Member("fall"), "value3");
		
		System.out.println(hashMap2.size());
		*/
	}
}
/* ��°�
2
*/