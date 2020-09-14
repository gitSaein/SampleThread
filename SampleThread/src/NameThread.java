
public class NameThread {

	public void named() {
		Thread subThread1 = new Thread() {
			public void run () {
				int sum = 0;
				for(int index = 0; index < 10; index ++) {
					sum += index;
					System.out.println(sum);
				}
				System.out.println(Thread.currentThread().getName() + ": " + sum);
			}
		};
		Thread subThread2 = new Thread(subThread1);

		subThread1.setName("thread1");
		subThread2.setName("Thread2");
		
		subThread1.start();
		subThread2.start();
	}
	
}
