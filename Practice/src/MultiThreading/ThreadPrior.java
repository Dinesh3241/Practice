package Thread;

public class ThreadPrior extends Thread {
	
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
	}

}
