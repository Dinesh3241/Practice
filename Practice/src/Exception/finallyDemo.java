package Exception;

public class finallyDemo {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		}catch(Exception e)
		{
			System.out.println("String has null value");
		}
		finally {
			System.out.println("This will always executes...");
		}

	}

}

