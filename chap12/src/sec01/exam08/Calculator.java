package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);// �����带 2�ʰ� �Ͻ�������Ŵ
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
}
