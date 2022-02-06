class A1{
	int a=10, b=20;
	void display() {
		System.out.println("in class A ---> " + a + " | " + b);		
	}
} 

class B1 extends A1{
	int a=11, b=22;
	@Override
	void display() {
		System.out.println("in class B ---> " + this.a + " | " + b + " | " + super.a + " | " + super.b);
		super.display();
	}
	
	@Override
	public String toString() {
		return "States [this.a=" + this.a + " | this.b=" + this.b + " | super.a="+super.a+" | super.b="+super.b+"]";
	}	
}

public class OverridingTest {

	public static void main(String[] args) {
		B1 obj = new B1();
		System.out.println(obj.a + " | " + obj.b);
		obj.display();
		
		System.out.println(obj); //toString()
	}
}
