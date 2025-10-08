package Thread;

public class ThreadSleepMain {

	public static void main(String[] args) {
		ThreadPause tp = new ThreadPause(5);
		
		tp.start();
		
		ThreadPause tp1 = new ThreadPause(7);
		tp1.start();
	}

}
