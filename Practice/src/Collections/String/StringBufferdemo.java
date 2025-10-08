package String;

public class StringBufferdemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		
		System.out.println(sb.append(", Dinesh"));// It will not create a copy of it
		System.out.println(sb);  
		

	}

}
