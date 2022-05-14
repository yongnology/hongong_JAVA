package sec01.exam04;
// String 객체를 중복 없이 저장하는 HashSet
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");	// Java는 한 번만 저장된다.
		set.add("IBATIS");
		
		int size= set.size();
		// 저장된 객체 수 얻기
		System.out.println("총 객체수 : "+ size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");	// 1개의 객체(JDBC) 삭제
		set.remove("iBatis");	// 1개의 객체(iBATIS) 삭제
		
		System.out.println("총 객체수 : " + set.size());
		// 저장된 객체 수 얻기
		
		iterator = set.iterator();// 반복자 얻기
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();	// 모든 객체를 제거하고 비움
		if(set.isEmpty() ) {
			System.out.println("비어있음");
		}
	}
}
