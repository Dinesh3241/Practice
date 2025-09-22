package Inheritance;

 class Vehicle{
	public void show() {
		System.out.println("This is Vehicle");
	}
}

 class Car extends Vehicle{
	 public void show1() {
		 System.out.println("This is Car");
	 }
 }


public class SingleInherit {

	public static void main(String[] args) {
		Car c = new Car();
		c.show();
		c.show1();

	}

}
