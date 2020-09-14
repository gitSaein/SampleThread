public class Main {

	public static void main(String[] args) {
		SynchronizeSample nt = new SynchronizeSample();
		Thread thread1 = new Thread(()->{
			nt.setValue(10);
		});
		
		Thread thread2 = new Thread(()->{
			nt.setValue(100);
		});
		
		thread1.setName("thread1");
		thread2.setName("thread2");
		thread1.start();
		thread2.start();
	}
}
