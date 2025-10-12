package lambdaExpression;

public class LambdaExp {

	 public static void main(String[] args) {
		 Runnable greet = () -> System.out.println("Hello from Lambda Expression!");
		 greet.run();
	 }
}

