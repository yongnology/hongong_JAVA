package sec01.exam08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);// 스레드를 2초간 일시정지시킴
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": "+this.memory);
	}
}
