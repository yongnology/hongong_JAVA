package sec01.question.exam08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Student �ߺ� ���� ����
public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		
		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));	// �й��� �����Ƿ� ������� ����
		
		Iterator<Student> iterator = set.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}
}
/* ��°�
1:ȫ�浿
2:�ſ��
*/