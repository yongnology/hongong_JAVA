package sec01.exam06;
// �߻� �޼ҵ� ����
public interface RemoteControl {
	// ���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	/*public abstract �� �����Ǿ� �ִ�.*/
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
}
