package sec01.exam04;
// String ��ü�� �ߺ� ���� �����ϴ� HashSet
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");	// Java�� �� ���� ����ȴ�.
		set.add("IBATIS");
		
		int size= set.size();
		// ����� ��ü �� ���
		System.out.println("�� ��ü�� : "+ size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");	// 1���� ��ü(JDBC) ����
		set.remove("iBatis");	// 1���� ��ü(iBATIS) ����
		
		System.out.println("�� ��ü�� : " + set.size());
		// ����� ��ü �� ���
		
		iterator = set.iterator();// �ݺ��� ���
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		set.clear();	// ��� ��ü�� �����ϰ� ���
		if(set.isEmpty() ) {
			System.out.println("�������");
		}
	}
}
