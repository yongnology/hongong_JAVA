package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

// String ��ü�� �����ϴ� ArrayList
public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String ��ü�� ����
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		System.out.println(list);
		
		// ����� �� ��ü �� ���
		int size = list.size();
		System.out.println("�� ��ü�� �� : "+ size);
		System.out.println();
		
		// 2�� �ε����� ��ü ���
		String skill = list.get(2);
		System.out.println("2: "+ skill);
		System.out.println();
		
		// ����� �� ��ü ����ŭ ����
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		list.remove(2);	// 2�� �ε��� ��ü Database ����
		list.remove(2);	// 2�� �ε��� ��ü Servlet/JSP ����
		list.remove("iBATIS");	// iBATIS ����
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}

}
/* ��°�
[Java, JDBC, Database, Servlet/JSP, iBATIS]
�� ��ü�� �� : 5

2: Database

0:Java
1:JDBC
2:Database
3:Servlet/JSP
4:iBATIS

0:Java
1:JDBC
*/