public class Deamon {
	
	public void deamon(){
		
		Thread deamon = new Thread(()->{
			while( true ) {
				System.out.println("Deamon thread ing");
				try {
					Thread.sleep(1);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		deamon.setDaemon(true);
		deamon.start();
		
		try {
			System.out.println("Main Thread ing");
			Thread.sleep(10);
			System.out.println("Main Thread end");
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
