package Thread;

public class ThreadPause extends Thread {
	int n;
	ThreadPause(int no){
		n = no;
	}
	
	public void run() {
		
		for(int i = 0 ; i < n ; i++) {
			try {
				System.out.println("Hello "+(i+1));
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.print(e);
			}
		}
	}
}
