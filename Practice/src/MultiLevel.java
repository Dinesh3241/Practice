package Inheritance;

class GrandFather1{
	public void property() {
		System.out.println("Grand Father Property");
	}
}

class Father1 extends GrandFather1{
	public void property2() {
		System.out.println("Father Property");
	}
}

class Child1 extends Father1{
	public void property3() {
		System.out.println("Child Property");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		Child1 c = new Child1();
		
		c.property();
		c.property2();
		c.property3();

	}

}
