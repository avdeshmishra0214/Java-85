package co.edureka.except;
class Calculator{
	void div(int x, int y) {
		if(y == 0)
			//throw new ArithmeticException();
			throw new ArithmeticException("cannot divide by 0");
		int z = x/y;
		System.out.println("result = " + z);
	}
}
public class ThrowTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			//calc.div(10, 5);
			calc.div(25, 0);
		}catch(Exception ex){
			System.out.println("message ---> " + ex.getMessage());
			System.out.println(ex); //toString();
		}
	}

}
