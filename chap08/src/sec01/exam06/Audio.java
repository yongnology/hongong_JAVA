package sec01.exam06;
// ���� Ŭ����
public class Audio implements RemoteControl{
	// �ʵ�
	private int volume;
	
	@Override
	// turnOn() �߻� �޼ҵ� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	@Override
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	@Override
	// setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + this.volume);
	}
}
