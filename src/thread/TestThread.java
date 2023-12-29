package thread;

public class TestThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		
//		for(var i = 0; i < 10; i++) {
//			Thread thread = new Thread(new DownloadFileTask()); //kreirali novi thread
//			thread.start();
//		}
		

		Thread thread = new Thread(new DownloadFileTask()); //kreirali novi thread
		thread.start();
		
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("File is ready to be scanned.");
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread.interrupt();
		
	}

}