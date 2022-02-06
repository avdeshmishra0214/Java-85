class A2{
	A2(){
		System.out.println("in class A constructor");
	}
}

class B2 extends A2{
	B2(){
		System.out.println("in class B constructor");
	}
}

public class InheritanceTest2 {

	public static void main(String[] args) {
		B2 obj = new B2(); 
	}

}
