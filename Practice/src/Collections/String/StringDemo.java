package String;

public class StringDemo {

	public static void main(String args[]) {
		String s = new String("Dinesh Reddy");
		System.out.print(s + " ");
		
		String s1 = "is a good boy";
		System.out.print(s1 + " \n");
		
		String s2 = "Hello";
		String s3 = new String("Hello");
		
		System.out.println(s2.equals(s3));
		System.out.println(s2 == s3);
		
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		
		System.out.println(s3.charAt(3));
		System.out.println(s3.isEmpty());
		

	}

}
