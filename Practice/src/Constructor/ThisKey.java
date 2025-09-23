package Inheritance;

class Base3{
	 int v,t;

	Base3(int v , int t){
		this.v = v;
		this.t = t;
	}
	
	public void add() {
		System.out.println("The Addition Of "+this.v+" & "+this.t+" = "+(this.v+this.t));
	}
}

public class ThisKey {

	public static void main(String[] args) {
		Base3 b = new Base3(2,5);
		b.add();

	}

}
