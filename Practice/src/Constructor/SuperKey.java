package Inheritance;

class Parent{
	public void show() {
		System.out.println("This is Parent Class");
	}
}

class Child2 extends Parent{
	
	public void show() {
		System.out.println("This is Child2 Class");
	}
}

class Child3 extends Child2{
	
	public void show() {
		super.show();
		System.out.println("This is Child3 Class");
	}
	
}

public class SuperKey {

	public static void main(String[] args) {
		Child3 c = new Child3();
		
		c.show();
//		super.show();

	}
}

