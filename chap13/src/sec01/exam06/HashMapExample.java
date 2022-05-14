package sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// �̸��� Ű�� ������ ������ �����ϱ�
public class HashMapExample {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);	
		map.put("ȫ�浿", 95);
		// "ȫ�浿"Ű�� �����Ƿ� ���� �������� ����� ������ ��ü
		System.out.println("�� Entry �� : " + map.size());
		// ����� �� Entry �� ���
		
		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		// �̸�(Ű)���� ����(��)�� �˻�
		System.out.println();
		
		// ��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();	// Key Set ���
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : "+value);
		}
		System.out.println();
		
		// ��ü ����
		map.remove("ȫ�浿");
		// Ű�� Map.Entry�� ����
		System.out.println("�� Entry �� : " + map.size());
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
			// Map.Entry Set���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+ " : " + value);
		}
		System.out.println();
		
		// ��ü ��ü ����
		map.clear();	// ��� map.Entry ����
		System.out.println("�� Entry �� : " + map.size());
		
	}

}
/* ��°�
�� Entry �� : 3
ȫ�浿 : 95

ȫ�浿 : 95
�ſ�� : 85
���屺 : 80

�� Entry �� : 2
�ſ�� : 85
���屺 : 80

�� Entry �� : 0
*/