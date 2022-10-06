package sec2;
public class ThreadEx {
	public static void main(String[] args) {
		Thread thread = new MovieTh();
		thread.start();
		
		try { Thread.sleep(1000);} catch (InterruptedException e) {}
		thread.interrupt();
	}

}
