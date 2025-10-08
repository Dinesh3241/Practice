package Thread;

public class RunnableDemo implements Runnable{
	public void run() {
		for(int i = 1 ; i<=5 ; i++) {
			try {
				System.out.println(i);
				Thread.sleep(2500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
