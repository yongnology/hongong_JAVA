package sec01.exam05;
// ���� �������̽� ���� Ŭ����
public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {		// 10���� ũ�ٸ�
			this.volume = RemoteControl.MAX_VOLUME;	// 10���� ����
		} else if(volume<RemoteControl.MIN_VOLUME) {	// 0���� �۴ٸ�
			this.volume = RemoteControl.MIN_VOLUME;		// 0���� ����
		} else {
			this.volume = volume;
		}
		System.out.println("���� ���� : "+ this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}
