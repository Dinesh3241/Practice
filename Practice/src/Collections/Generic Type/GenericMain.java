package Collections;

public class GenericMain {

	public static void main(String[] args) {
		GenericType<String> g = new GenericType<>();
		
		g.set("Dinesh");
		System.out.println(g.get());

	}

}
