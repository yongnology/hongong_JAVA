package sec01.exam05;
// �������̽� ������ ���� ��ü ����
public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		Searchable searchable = tv;
		searchable.search("http://www.naver.com");
	}

}
/* ��°�
TV�� �մϴ�.
���� ���� : 5
TV�� ���ϴ�.
http://www.naver.com�� �˻��մϴ�.
*/