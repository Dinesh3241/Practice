package Thread;

public class ThreadPriorMain {

	public static void main(String[] args) {
		
		ThreadPrior tp = new ThreadPrior();
		
		tp.setName("Thread 1");
		tp.setPriority(5);
		tp.start();
		
		ThreadPrior tp1 = new ThreadPrior();
		
		tp1.setName("Thread 2");
		tp1.setPriority(10);
		tp1.start();



	}

}
