
public class SynchronizeSample {

	private int value;
	//  스레드가 사용중인 객체를  lock 걸어 해당 작업을 진행하는 thread가 작업을 마칠때까지 다른 쓰레드가 작업을 하지 못하게 하는 방법입니다.
	public synchronized void setValue(int value) {
		this.value = value;
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.value);
	}
	
	//동기화 블록
	public void setValue2(int value) {
		synchronized(this) {
			this.value = value;
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.value);
		}
	}
}
