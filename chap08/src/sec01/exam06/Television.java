package sec01.exam06;
// ���� Ŭ����
public class Television implements RemoteControl{
	// �ʵ�
	private int volume;
	
	@Override
	// turnOn() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	@Override
	// turnOff() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	@Override
	// setVolume() �߻� �޼ҵ��� ��ü �޼ҵ�
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {		// 10���� ũ�ٸ�
			this.volume = RemoteControl.MAX_VOLUME;	// 10���� ����
		} else if(volume<RemoteControl.MIN_VOLUME) {	// 0���� �۴ٸ�
			this.volume = RemoteControl.MIN_VOLUME;		// 0���� ����
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+ this.volume);
		}
}

