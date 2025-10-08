package String;

import java.util.Scanner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Welcome");
		
		System.out.println("Enter Your Name : ");
		String name = s.next();
		
		sb.append(", ");
		sb.append(name);
		
		System.out.println(sb);

	}

}
