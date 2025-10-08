package Thread;

public class RunnableMain {

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		
		t.start();
		

	}

}
