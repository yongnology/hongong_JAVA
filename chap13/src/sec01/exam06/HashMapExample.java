package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 이름을 키로 점수를 값으로 저장하기
public class HashMapExample {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);	
		map.put("홍길동", 95);
		// "홍길동"키가 같으므로 제일 마지막에 저장된 값으로 대체
		System.out.println("총 Entry 수 : " + map.size());
		// 저장된 총 Entry 수 얻기
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		// 이름(키)으로 점수(값)을 검색
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();	// Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : "+value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		// 키로 Map.Entry를 제거
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			// Map.Entry Set얻기
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+ " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();	// 모든 map.Entry 삭제
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
/* 출력값
총 Entry 수 : 3
홍길동 : 95

홍길동 : 95
신용권 : 85
동장군 : 80

총 Entry 수 : 2
신용권 : 85
동장군 : 80

총 Entry 수 : 0
*/